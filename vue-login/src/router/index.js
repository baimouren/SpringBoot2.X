import Vue from 'vue'
import Router from 'vue-router'
import Bill from '@/components/Bill'
import Login from '@/components/Login'
import Upload from '@/components/Upload'
import ElButton from '@/components/ElButton'
import EditeTable from '@/components/EditeTable'
import Home from '@/components/Home'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '登录',
      component: Login
    },{
      path: '/home',
      name: '主页',
      component: Home,
      children:[{
          path: '/bill',
          name: '账单',
          component: Bill
        },{
          path: '/upload',
          name: '上传',
          component: Upload
        },{
          path: '/elButton',
          name: '按钮',
          component: ElButton
        },{
          path: '/editeTable',
          name: '编辑表格',
          component: EditeTable
      }]
    }
  ]
})
