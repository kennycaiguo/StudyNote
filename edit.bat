::https://wenku.baidu.com/view/371957c06137ee06eff91819.html
::bat����ִ����֮�󲻽���ӡ��ִ�н����Ĭ�ϻ����ִ�е�������ʾһ��
::@���ŵ����þ��ǲ���ʾִ�е�����
::echo off�൱����ÿ������ǰ��һ��@���ţ�ʵ����echo������ո���ַ������൱��������ַ�������echo�����off����ر����
::@echo off��˼�ǲ���ʾecho off����
::pause Ϊ��ֹ������ִ����������˳������pause���ִ��pauseָ��֮�����ʾPress any key to continue...
::��::һ����remҲ��ע������

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
:1
echo ����ִ��ʧ��
goto exit
:exit