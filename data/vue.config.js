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


module.exports = {
    outputDir: "../main/resources/static",
    indexPath: "../main/resources/static/index.html.bak.org",
    devServer: {
        proxy: "http://localhost:8080"
    },
    chainWebpack: config => {
        const svgRule = config.module.rule("svg");
        svgRule.uses.clear();
        svgRule.use("vue-svg-loader").loader("vue-svg-loader");
    }
};