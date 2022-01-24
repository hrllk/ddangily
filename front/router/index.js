import Vue from 'vue';
import VueRouter from 'vue-router';

import Home from "@/views/Home";

Vue.use(VueRouter);


const routes = [
    {
        path: '/',
        redirect:'/home',
    },{
        path: '/home',
        name: 'home',
        // component: () => import(/* webpackChunkName: "about" */ '../src/views/Home.vue'),
        component: Home,

    },{
        path: '/about',
        name: 'about',
        component: () => import(/* webpackChunkName: "about" */ '../src/views/About.vue'),
        // component: About,

    },{
        path: '/come',
        name: 'come',
        component: () => import(/* webpackChunkName: "about" */ '../src/views/Come.vue'),
        // component: About,

    },
]

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes,
});

export default router;