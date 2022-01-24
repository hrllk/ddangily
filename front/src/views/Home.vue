<template>
  <div class="card mt-5">
    <div class="card-header">
    </div>
    <div class="card-body">
      <div class="row">
        <div class="col-md-12">
          <ul>

            <li v-for='item in items'>
              {{ item.lang }}
            </li>

          </ul>
        </div>
      </div>
    </div>
  </div>
</template>


<script>
import axios from "axios";


// const RESTHost = "localhost:8081";
var app = new Vue({
  el: '.card-body',
  data: {
    items: [
      {lang:'java'},
      {lang:'java'},
      {lang:'java'},
      {lang:'java'},
      {lang:'java'},
    ]
  }
})
export default {
  name: "Home.vue",

// axios
  mounted: function () {
    console.log("hi,")
    getPosts();
  },

}

function getPosts(){
    axios.get('rest/v1/posts').then(res => {
      console.log(res);


    });
}
</script>

<style scoped>

</style>