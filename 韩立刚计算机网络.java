韩立刚计算机网络


21世纪
	数字化
	网络化
		三网
			电信网络
				手机、电话组成的网络
			计算机网络
				因特网
				其他网络
					银行
					军事
			有线电视网络
	信息化


计算机网络的重要功能
	连通性 彼此连通，交换信息
	共享性 信息共享、软硬件共享
		硬件共享的例子：共享打印机
		软件共享的例子：远程连接服务器


网络 互联网 因特网
	网络：许多计算机连在一起
	互联网：许多网络连在一起
	因特网：全球最大的互联网

因特网发展的三个阶段
	第一阶段：ARPANET向互联网发展	
	第二阶段：三级结构的因特网		
	第三阶段：多层次ISP结构的因特网	1993

	ISP就是移动 连通 电信网络服务运营商

电信机房
网通机房
双线机房

因特网由核心部分和边缘部分组成

边缘部分：
主机之间的通信方式：
	客户服务器方式 C/S：浏览器访问服务器 用户下载时只能从服务器上下载
	对等连接方式 P2P：主机既是客户机又是服务器 用户下载时搜寻所有安装了P2P软件的主机，如果主机当中有自己所需要的文件包，就可以从这些安装了P2P软件的主机上同时下载

核心部分：
数据交换方式：
	电路交换
	报文交换
	分组交换		实际的计算机之间通信采用的方式

电路交换：所有的电话都连在一台交换机上，分三步
	建立连接：申请占用通信资源
	通话：一直占用通信资源
	释放连接：释放通信资源

	电话也可以分成小组分别连在不同的交换机上，多台交换机之间可以通过中继线连在一起
	
	如果A正在给B打电话，则C不可以给A打电话，因为占线了
	每台电话机独占一条线路
	
	电路交换适合于数据量很大的实时性传输，实时性代表传输延迟很小
	核心路由器之间可以使用电路交换

分组交换：
	假设有一个完整的word文档，总共20MB，这个完整的word文档就是一个报文
	这个报文可以分成多段发送，每段加上首部，首部当中包含源和目标的地址，以及当前段是第几段

	接收端分别将首部去掉，攒成完整的数据

	路由器存储转发功能
		路由器接收到数据包之后会有缓冲，然后根据每个包的的目标地址选择合适的出口转发

	分组交换比较高效、灵活、迅速、可靠，但是有延迟、且开销大

	分组交换在通信之前不需要建立连接

报文交换	
	报文一般比分组长很多
	报文交换的延迟较长

1994年4月20日正式接入互联网

计算机网络分类
按作用范围来分
	广域网WAN	城域网MAN	局域网LAN	个人区域PAN
	新的理解：不单单从网络的覆盖范围区分广域网和局域网
	应用了广域网技术的即使距离较近就是广域网，例如通过QQ传文件给自己的邻居，就要通过互联网去传递，这明显是广域网，而通过无线传递文件时是局域网
	
	局域网：自己购买设备 自己维护 带宽固定 100M 1000M 距离100米以内
	
	广域网：花钱买服务 花钱买带宽
按使用者分
	公用网Public NetWork		专用网Private NetWork

按拓扑结构分
	总线型	环形	星型	树形	网状
	
按交换方式分
	电路交换		报文交换		分组交换
	
按工作方式分
	资源子网		通信子网		接入网


计算机网络的性能
	1、速率
		连接在计算机网络上的主机在数字信道上传输数据位数的速率
		b/s kb/s Mb/s Gb/s
		注意是小写的b
	2、带宽
		数据通信领域中，数字信道所能传送的最高速率
		
	3、吞吐量
		单位时间内通过某个网络的数据量

	4、时延
		发送时延
		传播时延
		处理时延
		排队时延

	5、时延带宽积=传播时延*带宽

	6、往返时间 rtt
		从发送方发送数据开始，到发送方收到接收方确认
		
	7、利用率
		信道利用率：有数据通过时间/(有+无)数据通过时间
		网络利用率：信道利用率加权平均值

计算机网络体系结构
ISO：国际标准化组织
OSI/RM：互联网法律上的国际标准
TCP/IP Suite：因特网事实上的国际标准
Network Protocols：数据交换遵守的规则、标准或约定
网络体系结构：计算机网络各层及其协议的集合

OSI：
应用层 能够产生网络流量 能够和用户交互的是应用层
	记事本虽然可以和用户交互，但是并不产生流量，没有数据交互，不属于应用层
	
表示层 加密 压缩
	软件开发人员要考虑的 比如一个视频要通过加密算法上传 QQ信息传递时需要加密传输

会话层 服务和客户端建立的会话 netstat -n
	查木马 木马会通过网络监听计算机的行为 当打开计算机联网之后不打开任何软件，不产生任何流量时，执行netstat -nb之后如果仍然有会话，则有可能是木马
	
传输层 可靠传输(建立会话) 不可靠传输(不建立会话) 流量控制
	下载电影就是可靠传输，分组发送时必须保证所有组都收到，否则电影打不开
	QQ聊天是不可靠传输，点击发送时QQ会尝试发送很多次，如果发送失败会提示用户
	屏幕广播软件也是不可靠传输

网络层 选择最佳路径 IP地址编址

数据链路层 数据如何封装 添加物理层地址(MAC地址)

物理层 电压(多少伏代表0 多少伏代表1等规则) 接口标准(所有的网线都是8根)
	
	
网络排错 要从底层往高层排查
	
应用层	传输数据单元PDU
运输层	报文
网络层	IP数据报(IP分组)
数据链路层	数据帧
物理层	01010101
		电缆
		
		
VMnet0代表物理网卡和物理交换机
VMnet1 VMnet8这些都是虚拟交换机	
	
物理层
物理层解决如何在连接各种计算机的传输媒体上传输数据比特流，而不是指具体的传输媒体
物理层的主要任务描述为：确定与传输媒体的接口的一些特性，如：
机械特性：例接口形状、大小、引线数目
电气特性：例规定电压范围（-5V到+5V）
功能特性：例规定-5V表示0，+5V表示1
过程特性：也称规程特性，规定建立连接时各个相关部件的工作步骤


基带信号传输距离较近，所以需要对其调制，调制的方式通常有
调幅
调频
调相






















































































































































































































































































