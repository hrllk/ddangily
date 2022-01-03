// import {createRouter, createWebHashHistory} from 'vue-router'
// // import {createRouter} from 'vue-router'
//
//
// // import Home from '@/views/Home.vue';
// import HomeComponent from '@/router/views/HomeComponent';
// import SignupPage from '@/router/views/AboutComponent.vue';
//
// const routes = [
//     // {
//     //     path: '/',
//     //     component: Home,
//     // },
//     {
//         path: '/',
//         component: HomeComponent,
//     },
//     {
//         path: '/signup',
//         component: SignupPage,
//     },
// ]
//
// const router = createRouter({
//     history: createWebHashHistory(),
//     // mode: 'history',
//     routes
// });
//
// export default router;



// import Vue from 'vue'
// import VueRouter from 'vue-router'
//
//
// /* views */
// import HomeComponent from '@/router/views/HomeComponent';
// import SignupPage from '@/router/views/AboutComponent.vue';
//
// Vue.use(VueRouter)
//
// const route = [
//     {
//         path: "/",
//         component: HomeComponent
//     },{
//         path: "/about",
//         component: SignupPage
//     },
// ]
//
// const router = new VueRouter({
//     mode: 'history',
//     routes: route
// })
//
// export default router;



import {createApp} from 'vue';
import VueRouter from 'vue-router';

Vue.use(VueRouter);


/* views */
import HomeComponent from '@/router/views/HomeComponent';
import SignupPage from '@/router/views/AboutComponent.vue';


const router = new VueRouter({
    mode: 'history',
    linkActiveClass: 'active',
    routes: [
        {
            path: '/',
            component: HomeComponent,
            // redirect: '/home',
        }, {
            path: '/about',
            component: SignupPage,
            // redirect: '/about',
        }
    ],
});

export default router;