<template>
  <v-card color="basil">
      <v-card-title class="text-center justify-center py-6">
      <h1 class="font-weight-bold text-h2 basil--text">
       땡일리
      </h1>
    </v-card-title>

<!--        v-model="tab"-->
    <v-tabs
        background-color="transparent"
        color="basil"
        grow
    >
<!--      <v-tab @click="currentTab='home'">홈</v-tab>-->
<!--      <v-tab @click="currentTab='intro'">소개</v-tab>-->
<!--      <v-tab @click="currentTab='way'">오시는길</v-tab>-->
<!---->
<!--      <v-tab @click="currentTab='home'">홈</v-tab>-->
<!--      <v-tab @click="currentTab='intro'">소개</v-tab>-->
<!--      <v-tab @click="currentTab='way'">오시는길</v-tab>-->

      <v-tab @click="clickTab('/home')">홈</v-tab>
      <v-tab @click="clickTab('/about')">소개</v-tab>
      <v-tab @click="clickTab('/come')">오시는길</v-tab>
    </v-tabs>


  </v-card>



<!--<v-btn>hibttn</v-btn>-->
<!--  <v-btn @click="clickBtn()">hi</v-btn>-->
</template>
<script>
export default {
  data () {
    return {
      // currentTab: 'home',
    //   computed: {
    //   }
    }
  },

  methods: {
    clickTab(page){
      console.log("page:",page);
      this.$router.push(page);
      // this.$emit('page',page);


    }
  }


}
</script>
<style>
/* Helper classes */
.basil {
  background-color: #FFFBE6 !important;
}
.basil--text {
  color: #356859 !important;
}
</style>