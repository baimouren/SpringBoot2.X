<template>

<!--  <el-input v-model="name"></el-input>-->

  <div class="container">
    <div>
      <el-button type="primary" icon="el-icon-search" @click="search">搜索</el-button>
    </div>
  <el-table :data="tableData" style="width: 100%" :row-class-name="tableRowClassName">
    <el-table-column prop="rowId" label="行号" width="180"></el-table-column>
    <el-table-column prop="billDate" label="账单日期" width="180"></el-table-column>
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
        postJsonRequest(
          "/t/query/cb_m_bill",
          {"billPayer": "chengbin"}
        ).then(response =>{
          console.log(response);
        })
      }
    },
    data() {
      return {
        tableData: [
        {
          rowId: '20',
          billDate: '2016-05-02',
          billAmount: '25',
          billPayer: '金沙江',
          billUser: '普陀',
          billStore: '上海'
        },{
            rowId: '21',
            billDate: '2016-05-02',
            billAmount: '25',
            billPayer: '金沙江',
            billUser: '普陀',
            billStore: '上海'
          }
        ]
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
