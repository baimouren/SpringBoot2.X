<template>

<!--  <el-input v-model="name"></el-input>-->

  <div class="container">

    <el-row type="flex" justify="end">
      <el-col :span="10">
        <el-input placeholder="表" prefix-icon="el-icon-search" v-model="searchTab"></el-input>
      </el-col>
      <el-col :span="6">
        <el-button type="primary" icon="el-icon-search" @click="search">搜索</el-button>
      </el-col>
    </el-row>

  <el-table :data="tableData" height="550" boder style="width: 100%" :row-class-name="tableRowClassName">
    <el-table-column prop="rowId" label="行号" sortable></el-table-column>
    <el-table-column prop="billDate" label="账单日期" sortable></el-table-column>
    <el-table-column prop="billAmount" label="金额" sortable></el-table-column>
    <el-table-column prop="billPayer" label="付款人" sortable></el-table-column>
    <el-table-column prop="billUser" label="开票人" sortable></el-table-column>
    <el-table-column prop="billStore" label="消费点" sortable></el-table-column>
  </el-table>
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
      tableRowClassName({row, rowIndex}) {
        if (rowIndex === 1) {
          return 'warning-row';
        } else if (rowIndex === 3) {
          return 'success-row';
        }
        return '';
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
          "pageNo" : 1,
          "limit" : 10
        }).then(response =>{
          console.log(response);
          this.tableData = response.data;
        })
      }
    },
    data() {
      return {
        searchTab: '',
        tableData: [{}]
      }
    }
  }
</script>

<style>



  .el-table .warning-row {
    background: oldlace;
  }

  .el-table .success-row {
    background: #f0f9eb;
  }
</style>
