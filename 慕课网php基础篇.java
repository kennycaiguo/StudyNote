PHP����ƪ

Redis
Redis�пͻ��˺ͷ���� ͨ��˵��Redis��ָ�����
Redis�Ǵ������ڴ��еķǹ�ϵ�����ݿ⣬��Ϊ�����ڴ��У���˺ܿ�

Ӧ�ã�
����
����
���ݿ⣺����Redisӵ�е�������Ӳ�̳־û��Ļ���

��װ������
Linux/CentOS release 6.8

����RedisԴ�� 2.8.13

Redis��Ҫgcc��������tcl��Redis�Ĳ�������ǻ���tcl����������д�ģ�

����˰�װ��
tar xf redis-2.8.13.tar.gz
cd redis-2.8.13
make
sudo make install
��װ����/usr/local/bin/redis-server��

redisͨ����һ�������ļ����ʹ�ã������ļ��Ļ�����ʽ��Դ��·���µ�redis.conf�ļ���
�Ƚ����ļ����Ƶ���Ŀ¼�У����������������
daemonize yes //Ĭ��ֵΪno������ǰ̨��������Ϊyes��ɺ�̨����

port 7200 //Ĭ����6379�����ڶ�ʵ���Ͱ�ȫ�Ե����⣬ͨ����Ϊ7200

����redis����˵����redis-server /home/vagrant/config/redis/redis.conf ������Ϊredis server����ʱ�������������ļ�

��ʱȨ�޲���ʱ��Ҫʹ��sudo��ִ�У���Ҫ����redis-server��·����
sudo /usr/local/bin/redis-server /home/vagrant/config/redis/redis.conf

ȷ��һ��redis-server�Ƿ�����ʹ��ָ�ps aux|grep redis-server

��ʱʵ����redis�ͻ���Ҳ�Ѿ���װ��Linux���ˣ�����ʹ��which redis-cli�鿴��װ��λ��

ֱ��ִ��redis-cliָ������¼redis-server���ᷢ�ֵ�¼ʧ�ܣ���Ϊredis-cliĬ�ϵ�¼������6379�˿ڣ���Ҫ���ϲ�����redis-cli -h 127.0.0.1 -p 7200

��¼�ɹ���ִ��info���������ʾredis�������Ϣ

���������оͿ��Բ鿴Redis����Щ���������ˣ�String��List��Set��Hash Sort��Set
String�����Դ洢�ַ��������������㣬ͳ��ΪԪ�أ���д���������ַ������������������ͼӼ�
List���洢һ�����м�����ÿ���ڵ㶼������һ��Ԫ�أ���д�����������������롢�򵯳�Ԫ�ء��޼�����һ��Ƴ�Ԫ��
Set���洢������ͬ��Ԫ�أ���д�������Ӽ����в����ɾ��Ԫ��
Hash���洢key-value��ɢ���飬����key���ַ�����value��Ԫ�أ���д����������key��������ɾ��
Sort Set����������score-value���򼯺ϣ�����scoreΪ���㣬valueΪԪ�أ���д���������ϲ��롢���շ�����Χ����

String���ͣ�
key	value(string/int/float)
set string1 yejianfeng
get string1 //yejianfeng

set string2 4
get string2 //4

incr string2
get string2 //5

decrby string2 2
get string2 //3


List����
lpush list1 12 //lpush�����������
lpush list1 13
rpop list1 12  //rpop������ұ߳���

llen list1 //����list1�ĳ���

Set����
sadd set1 12
scard set1 //�鿴�м���Ԫ��
sadd set1 13
sadd set1 13
scard set1 //2 13�ظ�����ֻ��һ��

sismember set1 13 //1 ˵��13��set1�еĳ�Ա

srem set1 13 // ��set1��ɾ��13

Hash����
hset hash1 key1 12 //��Ϊkey1 ֵΪ12
hget hash1 key1 //12

hlen hash1 //1 ����Ϊ1

hmget hash1 key1 key2 //һ���Ի�ȡhash1��key1 key2��ֵ

SortSet���� ����hash����
zadd zset1 10.1 val1 //����һ������Ϊ10.1��ֵΪval1��zset1
zadd zset1 11.2 val2 
zadd zset1 9.2 val3
zcard zset1 //����Ϊ3
zrange zset1 0 2 withscores //���շ�������0-2��Ԫ������ �õ�9.2 10.1 11.2
zrank zset1 val2 //2 val2���ڵ�2��
zadd zset1 12.2 val3 //��val3��Ϊ12.2
zadd zset1 12.2 val2 //val2��val3��scoreһ��������keyֵ���У�val2��val3С�����val2����val3ǰ��




































