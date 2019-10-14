<template>

  <!--  <el-input v-model="name"></el-input>-->

  <div class="container">

    <el-row type="flex" justify="end">
      <el-col :span="2">
        <el-button type="primary" icon="el-icon-circle-plus-outline" @click="addRow" class="button_height">新增行</el-button>
      </el-col>
      <el-col :span="5"></el-col>
      <el-col :span="10">
        <el-input placeholder="请输入表名" prefix-icon="el-icon-search" v-model="searchTab" ></el-input>
      </el-col>
      <el-col :span="2">
        <el-button type="primary" icon="el-icon-circle-plus-outline" @click="search" class="button_height">查询</el-button>
      </el-col>
      <el-col :span="5"></el-col>
    </el-row>

    <el-table :data="tableData" class="tb-edit" height="550" boder highlight-current-row @row-click="handleCurrentChange">
      <el-table-column prop="rowId" label="行号" sortable></el-table-column>
      <el-table-column prop="startTime" label="开始时间" sortable>
        <template slot-scope="scope">
          <el-date-picker type="datetime" v-model="scope.row.startTime" placeholder="任意时间点" value-format="yyyy-MM-dd HH:mm:ss"></el-date-picker>
          <span>{{scope.row.startTime}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="endTime" label="结束时间" sortable>
        <template slot-scope="scope">
          <el-date-picker type="datetime" v-model="scope.row.endTime" placeholder="任意时间点" value-format="yyyy-MM-dd HH:mm:ss"></el-date-picker>
          <span>{{scope.row.endTime}}</span>
        </template>
      </el-table-column>
      <el-table-column label="金额" sortable>
        <template slot-scope="scope">
          <el-input size="small" v-model="scope.row.billAmount" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input>
          <span>{{scope.row.billAmount}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="billPayer" label="付款人" sortable>
        <template slot-scope="scope">
          <el-input size="small" v-model="scope.row.billPayer" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input>
          <span>{{scope.row.billPayer}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="billUser" label="开票人" sortable>
        <template slot-scope="scope">
          <el-input size="small" v-model="scope.row.billUser" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input>
          <span>{{scope.row.billUser}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="billStore" label="消费点" sortable>
        <template slot-scope="scope">
          <el-input size="small" v-model="scope.row.billStore" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input>
          <span>{{scope.row.billStore}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="billPayWay" label="付费方式" sortable>
        <template slot-scope="scope">
          <el-input size="small" v-model="scope.row.billPayWay" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input>
          <span>{{scope.row.billPayWay}}</span>
        </template>
      </el-table-column>
      <el-table-column prop="billSubmitDate" label="提交日期" sortable>
        <template slot-scope="scope">
          <el-date-picker v-model="scope.row.billSubmitDate" type="date" placeholder="选择日期" @change="handleEdit(scope.$index, scope.row)" value-format="yyyy-MM-dd"></el-date-picker>
          <span>{{scope.row.billSubmitDate}}</span>
        </template>
      </el-table-column>

      <el-table-column fixed="right" label="操作" width="100">
        <template slot-scope="scope">
          <el-button @click="rowSave(scope.$index, scope.row)" type="text" size="small">保存</el-button>
          <el-button @click="rowRemove(scope.row)"type="text" size="small">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <el-button-group>
      <el-button type="primary" icon="el-icon-arrow-left" @click="lastPage" class="button_height">上一页</el-button>
      <el-button type="primary" @click="nextPage" class="button_height">下一页<i class="el-icon-arrow-right el-icon--right"></i></el-button>
      <span>{{this.pageNo}}/{{this.pageCount}}页</span>
    </el-button-group>
  </div>
</template>

<script>

  import axios from 'axios'
  import {postJsonRequest} from '../utils/api'
  import {postRequest} from '../utils/api'
  import {putRequest} from '../utils/api'
  export default {
    created:function(){
      this.search();
    },
    methods: {
      rowRemove(row){
        console.log(row)
      },
      rowSave(index, row){
        console.log(index, row)
        axios({
          method: 'post',
          url: `/t/save/`+this.searchTab,
          data: row,
          headers: {
            'Content-Type': 'application/json'
          }
        }).then(response=> {
          console.debug("保存数据成功")
        });
      },
      addRow(){
        this.tableData.push({})
      },
      lastPage(){
        this.pageNo > 1 ? this.pageNo-- : this.pageNo;
        this.search();
      },
      nextPage(){
        this.pageNo < this.pageCount ? this.pageNo++ : this.pageNo;
        this.search();
      },

      handleCurrentChange(row, event, column) {
        // console.log(row, event, column, event.currentTarget)
      },
      handleEdit(index, row) {
        // console.log(index, row);
      },
      handleDelete(index, row) {
        // console.log(index, row);
      },
      search(){
        var tabName = this.tabName;
        if(this.searchTab == undefined || null == this.searchTab || this.searchTab.trim() == ""){
          tabName = "cb_m_bill";
        }else{
          tabName = this.searchTab;
        }

        console.log("tabName: " + tabName);
        postJsonRequest("/t/query/"+tabName, {
          "data" : [
            {
              col : "rowId",
              con : " >= ",
              val : "1"
            }
          ],
          "pageNo" : this.pageNo<=1?1:this.pageNo,
          "limit" : this.limit
        }).then(response =>{
          console.log(response);
          this.tableData = response.data.result;
          this.count = response.data.count;
          this.limit = response.data.limit;
          this.pageNo = response.data.pageNo;
          this.pageCount = Math.ceil(response.data.count/response.data.limit);
        })
      }
    },
    data() {
      return {
        count:0,
        limit:10,
        pageNo:1,
        pageCount:0,
        data:[],
        searchTab: 'cb_m_bill',
        tableData: [{}]
      }
    }
  }
</script>

<style scoped>

  * {
    margin: 0;
    padding: 0
  }
  body {
    font-family: Helvetica Neue, Helvetica, PingFang SC, Hiragino Sans GB, Microsoft YaHei, SimSun, sans-serif;
    overflow: auto;
    font-weight: 400;
    -webkit-font-smoothing: antialiased;
  }
  .tb-edit .el-input {
    display: none
  }
  .tb-edit .current-row .el-input {
    display: block
  }
  .tb-edit .current-row .el-input+span {
    display: none
  }

  .button_height{
    height: 25px;
  }

</style>
