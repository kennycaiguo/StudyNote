::https://wenku.baidu.com/view/371957c06137ee06eff91819.html
::http://blog.csdn.net/lanbing510/article/details/7461073
::bat����ִ����֮�󲻽���ӡ��ִ�н����Ĭ�ϻ����ִ�е�������ʾһ��
::@���ŵ����þ��ǲ���ʾִ�е�����
::echo off�൱����ÿ������ǰ��һ��@���ţ�ʵ����echo������ո���ַ������൱��������ַ�������echo�����off����ر����
::@echo off��˼�ǲ���ʾecho off����
::echo. ��˼�����һ�����У��������еġ�����Ҫ������ECHO�����м䲻���пո񣬷��򡰣�������������ʾ��Ϣ�������Ļ�����⡰���������ã���������[\]������һ���������
::pause Ϊ��ֹ������ִ����������˳������pause���ִ��pauseָ��֮�����ʾPress any key to continue...
::��::һ����remҲ��ע���������::�����Ƿ���echo on�������л���״̬��ʼ�ղ�����ԣ���rem��echo on��ʱ�ǿ��Ի��Ե�

::goto ָ����:xxx�൱�ڸ����������һ����ţ�����ͨ��goto xxx�������ñ�Ŵ���ָ��ִ��
::call 2.batִ��2.bat�������ļ���ִ����֮����������
::IF�жϸ�ʽ��IF [NOT] ERRORLEVEL number
::IF ERRORLEVEL������ӱ������ĳ������ĺ��棬ִ���������IF ERRORLEVEL���ж�����ķ���ֵ
::����:

echo off
dir z:
rem ���ִ��dir z:����1����ת�����Ϊ1��ִ��
IF ERRORLEVEL 1 goto 1
IF ERRORLEVEL 0 goto 0
echo ����ִ�гɹ�
goto exit
// :�����һ����ĸ��ͷ����ĸ������ɵı�ţ��ñ�Ųſɱ�gotoʶ�𣬶���ð�������еı�ź�������ݶ��ᱻ����
:1
echo ����ִ��ʧ��
goto exit
:exit

::errorlevel������������룬������ָ��ִ�еķ����룬Ĭ��ֵΪ0��һ������ִ�г������ errorlevel Ϊ1

ECHO @ECHO OFF>AUTOEXEC.BAT �����Զ��������ļ�
ECHO C:\CPAV\BOOTSAFE>>AUTOEXEC.BAT ���Զ��������ļ���׷������

PAUSE��ֹͣϵͳ�����ִ�в���ʾ�밴���������. . .

find ���ļ��������ַ���
FIND [/V] [/C] [/N] [/I] [/OFF[LINE]] "string" [[drive:][path]filename[ ...]]
  /V        ��ʾ����δ����ָ���ַ������С�
  /C        ����ʾ�����ַ�����������
  /N        ��ʾ�кš�
  /I        �����ַ���ʱ���Դ�Сд��
  /OFF[LINE] ��Ҫ���������ѻ����Լ����ļ���
  "string"  ָ��Ҫ���������ִ���
  [drive:][path]filename ָ��Ҫ�������ļ���

Find����type������ʹ��
Type [drive:][path]filename | find "string" [>tmpfile] #��ѡ����string����
Type [drive:][path]filename | find /v "string"   #�޳��ļ��а���string����
Type [drive:][path]filename | find /c   #��ʾ�ļ�����

����type test.txt|find "111" 



start �����ⲿ�����������´�����������
����start explorer d:\


assoc �� ftype
assoc ��ȡ������'�ļ���չ��'������������'�ļ�����'
ftype ��ȡ������'�ļ�����'������������'ִ�г���Ͳ���'

����˫��һ��.txt�ļ�ʱ��windows�����Ǹ���.txtֱ���ж��� notepad.exe ��
�����ȵ���assoc .txt�ҵ����ļ�����Ϊtxtfile
�ٵ��� txtfile ������������ txtfile=%SystemRoot%\system32\NOTEPAD.EXE %1
������"�ļ���ѡ��"��"�ļ�����"���޸���2�ֹ���

ftype           #��ʾ����'�ļ�����'����
ftype exefile   #��ʾexefile���͹����������У������ʾ exefile="%1" %*


assoc .txt=Word.Document.8 ����.txtΪword���͵��ĵ������Կ���.txt�ļ���ͼ�궼����
assoc .txt=txtfile �ָ�.txt����ȷ����

CALL���������������ִ�й����е�����һ������������һ��������ִ������ټ���ִ��ԭ����������

CALL [drive:][path]filename [batch-parameters]
���õ��������������filename ����������� .bat �� .cmd ��չ����

CALL :label arguments
���ñ��ļ�������Σ��൱���ӳ��򡣱����õ�������Ա�ǩ:label��ͷ
������goto :eof��β��





