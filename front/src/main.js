import Vue from 'vue';
import App from './App.vue';
import router from '../router/index';
import config from '../vue.config'

import Vuetify from 'vuetify';
import 'vuetify/dist/vuetify.min.css';
import Axios from 'axios';

Vue.use(Vuetify);
// Vue.prototype.$axios = Axios;
Vue.prototype.$http = Axios
Vue.config.productionTip = false;

new Vue({
  router,
  config,
  render: h => h(App),
  vuetify: new Vuetify(),
}).$mount('#app');
