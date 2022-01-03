// const path = require('path');



// module.exports = {
//     outputDir: path.resolve(__dirname, "../main/resources/static"),
//     devServer: {
//         proxy: {
//             '/api': {
//                 target: 'http://localhost:8080',
//                 ws: true,
//                 changeOrigin: true
//             }
//         }
//     }
// }


// module.exports = {
//     outputDir: "../main/resources/static",
//     indexPath: "../main/resources/static/index.html.bak.org",
//     devServer: {
//         proxy: "http://localhost:8080"
//     },
//     chainWebpack: config => {
//         const svgRule = config.module.rule("svg");
//         svgRule.uses.clear();
//         svgRule.use("vue-svg-loader").loader("vue-svg-loader");
//     }
// };


const path = require('path');

module.exports = {
    outputDir: '../src/main/resources/static',

    devServer: {
        port:3000,   //개발하는 동안 프런트엔드 페이지를 띄우는 포트
        proxy: {
         '/api/*' : {
             target: 'http://localhost:8080' // /api 요청을 할때 백엔드 호출
         }
        }
    }
}