<template>
<!--  <div id="app">-->
<!--    <div id="nav">-->
<!--      &lt;!&ndash; 해당 페이지로 이동 &ndash;&gt;-->
<!--      <router-link to="/">Home</router-link> |-->
<!--      <router-link to="/about">About</router-link>-->
<!--    </div>-->

<!--    &lt;!&ndash; 선택한 페이지 렌더링 &ndash;&gt;-->
<!--    <router-view/>-->
<!--  </div>-->

    <v-app id="app">
      <div id="nav">
        <!-- 해당 페이지로 이동 -->
        <router-link to="/">Home</router-link> |
        <router-link to="/about">About</router-link>
      </div>

      <!-- 선택한 페이지 렌더링 -->
      <router-view/>
    </v-app>
</template>

<script>

export default {
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
