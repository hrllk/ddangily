<template>
  <div class="row" style="padding: 15px">
    <div class="col-lg-3 col-md-3 col-sm-6" :key="idx" v-for="(data,idx) in list" style="width:300px; height: 300px; padding: 15px">
      <img :src="data.mediaUrl" width="100%" height="100%">
    </div>
<!--      <option :key="idx" :value="data.value" v-for="(data,idx) in list">{{ data.t }}</option>-->

  </div>
</template>


<script>
import axios from "axios";
// import Vue from "vue";

// const app = new Vue({
//   el: '#app',
//   data: {
//     datas: [
//         {item: "값1"},
//       {item: "값2"},
//       {item: "값3"}
//     ]
//   }
// })
// app.


export default {
  // name: "Home.vue",

  data() {
    return {
      list :[]
    }
  },


  methods: {
  },
  // beforeCreate() {
  //   console.log('beforeCreate');
  // },
  // created() {
  //   console.log('created');
  // },
  // beforeMount() {
  //   console.log('beforeMount');
  // },
  mounted() {
    // console.log('mounted');
    axios.get('rest/v1/posts').then(res => {
      console.log("res.data:", res.data);
      this.list = res.data;
    });
  },
  // beforeUpdate() {
  //   console.log('beforeUpdate');
  // },
  // updated() {
  //   console.log('updated');
  // },
  // beforeDestroy() {
  //   console.log('beforeDestroy');
  // },
  // destroyed() {
  //   console.log('destroyed');
  // }
}


</script>

<style scoped>

</style>