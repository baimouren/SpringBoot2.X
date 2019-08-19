<template>

<!--  <el-input v-model="name"></el-input>-->

  <div class="container">
    <div>
      <el-button type="primary" icon="el-icon-search" @click="search">搜索</el-button>
    </div>
  <el-table :data="tableData" height="550" boder style="width: 100%" :row-class-name="tableRowClassName">
    <el-table-column prop="rowId" label="行号"></el-table-column>
    <el-table-column prop="billDate" label="账单日期"></el-table-column>
    <el-table-column prop="billAmount" label="金额"></el-table-column>
    <el-table-column prop="billPayer" label="付款人"></el-table-column>
    <el-table-column prop="billUser" label="开票人"></el-table-column>
    <el-table-column prop="billStore" label="消费点"></el-table-column>
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
        postJsonRequest("/t/query/cb_m_bill", {
          "data" : {"billPayer": "chengbin"},
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
