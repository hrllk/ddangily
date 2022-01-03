// import { createApp } from 'vue'
// import App from './App.vue'
// import { router } from "router/router.js"
// import Vuetify from 'vuetify';
// import '../node_modules/vuetify/dist/vuetify.min.css';
// const app = createApp(App);
//
// app.use(router);
// app.use(Vuetify);
// app.mount('#app');



// Vue.use(Vuetify);
// Vue.config.productionTip = false

// new Vue({
//     router,
//     // store,
//     vuetify: new Vuetify(),
//     render: h => h(App)
// }).$mount('#app');

// import { createApp } from 'vue'
// import App from './App.vue'
// import router from '@/router/router';
//
// const app = createApp(App);
// app.use(router);
// app.mount('#app');




import Vue from 'vue';
// import VueRouter from 'vue-router';
import App from './App.vue';
import router from "@/router/router";

Vue.config.productionTip = false




// Vue.use(VueRouter);
 const vue = new Vue({
    mode: 'history',
    router,
    render: h => h(App),
}).$mount('#app');

export default vue;