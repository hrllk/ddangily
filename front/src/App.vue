<template>
    <v-app>

      <v-container fluid
          justify-center>

<!--        <Header/>-->
        <Header>
          <WaitingForm @create_wait="update_page"/>
        </Header>
        <!-- 선택한 페이지 렌더링 -->
        <router-view/>





      </v-container>
    </v-app>
</template>

<script>
import Header from './components/Nav'
// import Home from './views/Home'
// import Home from './components/Home'

export default {
  name: 'App',
  // data() {
  //   this.$parncurrentView: 'home'
  // },
  data: function (){
    // currentTab:"/home";
    return "home";
  },
  components: {
    Header,
    // Home
  },
  methods:{
    update_page: function(page){ // 이벤트 버스로부터 받은 객체
      // this.updated_waitings.push(waiting_list);
      console.log("하위컴포넌트(헤더)에서 올라온 페이지",page);

    }, // 데이터를 리스트에 추가
  }




}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  /*margin-top: 60px;*/
}
.container{
  padding: 0px !important;
}
</style>
