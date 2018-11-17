npm install react --save-dev //���浽package.json�ļ���

webpack��һ��ģ������������

�Ѹ�����Դ��js css less sass���ȶ�����ģ��

webpack app/index.js build/build.js //�����ֱ����Դ��Ŀ��js

����ͨ��require�ķ�ʽ����ģ��
var str=require("./app.js");
document.body.innerHTML = "111";

Ҳ����ͨ��define�ͻص��ķ�ʽ����ģ��
define(["./app.js"], function(str){
	document.body.innerHTML = str;
});

���Ҫ��webpack����css����Ҫ��װcss-loader style-loader
npm install css-loader style-loader --save-dev

//����cssģ��ķ�ʽ��
require("style!css!./css/reset.css");
require("style!css!./css/style.css");

css�ļ��������Ҫ��������cssģ�飬����ͨ��@import����
@import "./reset.css";
div{
	border: 2px solid #000;
}

// ��ӵ��webpack.config.js�ļ�֮��
// webpack.config.js
module.exports = {
	//���
	entry: "./app/index.js", //�����Ҫ������������ļ�����Ӧд�ɶ������ʽ��output�����filenameҲ��Ҫ�޸�Ϊ"[name].js"���������name��һ��������ֵentry����ÿһ���key��ֵ��Ҳ����˵��keyֵ�������Ϊ�ļ���
	//���
	output: {
		path: "./build/",
		filename: "build.js"
	},
	module: {
		loaders: [
			{
				test: /.css$/,
				loader: ["style","css"], //�ڴ�������֮����index.js����ļ��е�require������д��style!css!��������ʽ
				exclude: "/node_modules/" //�ų��Ĳ���
			}
		]
	},
	//�ڴ�������֮�������package.json��Ҳд��--hot --inline
	devServer: {
		hot: true,
		inline: true
	},
	//���resolve֮������ļ���require����Ͳ���д��չ����
	resolve: {
		extensions: ["", ".js", ".css", ".jsx"]
	},
	plugins: [
		new htmlWebpackPlugin({
			title: "my first react app",
			chunks: ["build"], //��entryΪ��������ʱchunks����Ŵ˴�����html��������js�ļ�
			filename: "class.html" //���������ɵ�html�ļ�������д�Ļ�Ĭ��Ϊindex.html
		})
	]
};

�޸��ļ�Դ����Զ�ˢ��ҳ����޸�ͬ����ҳ���ϣ�
��װwebpack-dev-serverģ�飺
npm install webpack-dev-server
��װ������������ʹ��webpack-dev-server����
webpack-dev-server --hot --inline

webpack-dev-server --port 10000 �˿ڳ�ͻʱ���Ըı�˿ں�

webpack-dev-server --port 10000 --hot --inline����ָ�����������package.json��scripts builds��

����ʱ��Ҫ�����д���õ���Դ����һ��index.html�ļ��У�Ϊ�˱���ÿ����Ҫ�½�һ��index.html�ļ������԰�װhtml-webpack-plugin���
npm install html-webpack-plugin --save-dev

ʹ��ʱ������webpack.config.js������
var htmlWebpackPlugin = require("html-webpack-plugin");
����plugins������

����һ��ֻ��Ҫnpm run build����������й���

package.json��scripts���滹��������webpack�������ļ���
{
	build: "webpack.config.js",
	start_html: "webpack.html.config.js",
	
}
������ʱ�����ִ��npm run start_html��������webpack.html.config.js�����ļ�
������ʱ�����ִ��npm run build��������webpack.config.js�����ļ�


===============================================
webpackʵ���Ի����̳�
����cssʱ������Ҫʹ��css-loader������Ҫ����style-loader��style-loader�Ὣcss��style��ǩ����ʽ����html�ṹ��
����webpack������������֮��
module: {
	rules: [
		{
			test: /\.css$/,
			use: ['style-loader', 'css-loader']
		}
	]
}
������
import './main.css'; �ͻὫmain.css���뵽html��

css-loader�ᴦ��css�ļ��г��ֵ�url���Զ���������Ҫ�����ģ��
file-loader��1������Դ�ƶ������Ŀ¼ 2����������������Դ��url



