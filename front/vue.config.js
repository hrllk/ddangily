// const path = require('path');



// module.exports = {
//     outputDir: path.resolve(__dirname, "../main/resources/static"),
//     devServer: {
//         proxy: {
//             '/rest': {
//                 target: 'http://localhost:8080',
//                 ws: true,
//                 changeOrigin: true
//             }
//         }
//     }
// }


// module.exports = {
//     // outputDir: "../main/resources/static",
//     // indexPath: "../main/resources/static/index.html.bak.org",
//
//     devServer: {
//         // proxy: "http://localhost:8081"
//         // port: 8080,
//         proxy: {
//             '/rest': {
//                 target : 'http://localhost:8081',
//                 changeOrigin : true,
//                 // secure: false
//             }
//         }
//     },
//     // chainWebpack: config => {
//     //     const svgRule = config.module.rule("svg");
//     //     svgRule.uses.clear();
//     //     svgRule.use("vue-svg-loader").loader("vue-svg-loader");
//     // }
// };

// module.exports = {
//     devServer: {
//         proxy: {
//             // '^/rest': {
//             //     target: 'http://127.0.0.1:8081',
//             //     changeOrigin: true,
//             //     pathRewrite: {'^/rest': '/rest'},
//             // },
//             '/rest/': {
//                 target: 'http://127.0.0.1:8081',
//                 changeOrigin: true,
//                 logLevel: "debug"
//             },
//             // '/token': {
//             //     target: 'http://dev-rest-eunjinii.com',
//             //     changeOrigin: true,
//             // },
//         },
//     },
// };
module.exports = {
    runtimeCompiler: true,

    devServer: {
        proxy: {
            '^/rest': {
                target: 'http://localhost:8081',
                changeOrigin: true
            },
        }
    }
}