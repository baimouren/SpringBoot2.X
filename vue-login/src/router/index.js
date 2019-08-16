import Vue from 'vue'
import Router from 'vue-router'
import Bill from '@/components/Bill'
import Login from '@/components/Login'
import Upload from '@/components/Upload'
import ElButton from '@/components/ElButton'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: '登录',
      component: Login
    },{
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
    }
  ]
})
