<template>
  <div>
    <el-container height="100%">
      <el-header>Header</el-header>
      <el-container>
          <el-aside>
            <el-row class="tac">
              <el-col >
                <h5>默认颜色</h5>
                <el-menu
                  default-active="2"
                  class="el-menu-vertical-demo"
                  @open="handleOpen"
                  @close="handleClose">
                  <el-menu-item index="1">
                    <template slot="title">
                      <i class="el-icon-notebook-2"></i>
                      <span>账单</span>
                    </template>
                  </el-menu-item>
                  <el-menu-item index="2">
                    <i class="el-icon-upload"></i>
<!--                    <span>上传</span>-->
                    <el-link type="primary" href="#/upload">上传</el-link>
                  </el-menu-item>
                  <el-menu-item index="3" disabled>
                    <i class="el-icon-document"></i>
                    <span slot="title">导航三</span>
                  </el-menu-item>
                  <el-menu-item index="4">
                    <i class="el-icon-setting"></i>
                    <span slot="title">导航四</span>
                  </el-menu-item>
                </el-menu>
              </el-col>
            </el-row>
          </el-aside>
          <!-- Main区域 -->
          <el-main>Main随便写点啥都行</el-main>
        </el-container>
        <el-footer>  CB  </el-footer>
    </el-container>
  </div>
</template>

<script>

    export default {
      methods: {
        handleOpen(key, keyPath) {
          console.log(key, keyPath);
        },
        handleClose(key, keyPath) {
          console.log(key, keyPath);
        }
      }
    }
</script>

<style scoped>
  .el-aside, .home_container, .el-header, .el-main{
    margin: 0px;
    padding: 0px;
    top: 0px;
    left: 0px;
  }

  .home_container {
    position: absolute;
  }

  .el-header {
    background-color: #20a0ff;
    color: #333;
    text-align: center;
    display: flex;
    align-items: center;
    justify-content: space-between;
  }


  .el-main {
    background-color: #fff;
    color: #000;
    text-align: center;
  }
</style>
