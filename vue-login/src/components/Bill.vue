<template>

<!--  <el-input v-model="name"></el-input>-->

  <div class="container">

    <el-row type="flex" justify="end">
      <el-col :span="10">
        <el-input placeholder="请输入表名" prefix-icon="el-icon-search" v-model="searchTab" ></el-input>
      </el-col>
      <el-col :span="6">
        <el-button type="primary" icon="el-icon-search" @click="search" >搜索</el-button>
      </el-col>
    </el-row>

  <el-table :data="tableData" class="tb-edit" height="550" boder highlight-current-row @row-click="handleCurrentChange">
    <el-table-column prop="rowId" label="行号" sortable></el-table-column>
    <el-table-column label="账单日期"sortable>
      <template slot-scope="scope">
        <el-input size="small" v-model="scope.row.billDate" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input> <span>{{scope.row.billDate}}</span>
      </template>
    </el-table-column>
    <el-table-column label="金额" sortable>
      <template slot-scope="scope">
        <el-input size="small" v-model="scope.row.billAmount" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input> <span>{{scope.row.billAmount}}</span>
      </template>
    </el-table-column>
    <el-table-column prop="billPayer" label="付款人" sortable>
      <template slot-scope="scope">
        <el-input size="small" v-model="scope.row.billAmount" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input> <span>{{scope.row.billAmount}}</span>
      </template>
    </el-table-column>
    <el-table-column prop="billUser" label="开票人" sortable>
      <template slot-scope="scope">
        <el-input size="small" v-model="scope.row.billUser" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input> <span>{{scope.row.billUser}}</span>
      </template>
    </el-table-column>
    <el-table-column prop="billStore" label="消费点" sortable>
      <template slot-scope="scope">
        <el-input size="small" v-model="scope.row.billStore" placeholder="请输入内容" @change="handleEdit(scope.$index, scope.row)"></el-input> <span>{{scope.row.billStore}}</span>
      </template>
    </el-table-column>
  </el-table>
    <el-button-group>
      <el-button type="primary" icon="el-icon-arrow-left" @click="lastPage">上一页</el-button>
      <el-button type="primary" @click="nextPage">下一页<i class="el-icon-arrow-right el-icon--right"></i></el-button>
      <span>{{this.pageNo}}/{{Math.ceil(this.count/this.limit)}}页</span>
    </el-button-group>
  </div>
</template>

<script>
  import {postJsonRequest} from '../utils/api'
  import {postRequest} from '../utils/api'
  import {putRequest} from '../utils/api'
  export default {
    created:function(){
      this.search();
    },
    methods: {
      lastPage(){
        this.pageNo--;
        this.search();
      },
      nextPage(){
        this.pageNo++;
        this.search();
      },

      handleCurrentChange(row, event, column) {
        console.log(row, event, column, event.currentTarget)
      },
      handleEdit(index, row) {
        console.log(index, row);
      },
      handleDelete(index, row) {
        console.log(index, row);
      },
      search(){
        var tabName = "";
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
        })
      }
    },
    data() {
      return {
        count:0,
        limit:10,
        pageNo:1,
        data:[],
        searchTab: '',
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

  button{
    width: 100px;
    height: 35px;

  }
</style>
