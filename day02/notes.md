# 知识碎片

## Git拷贝远程分支到本地

> `git checkout -b dev origin/dev`，作用是checkout远程的dev分支，在本地起名为dev分支，并切换到本地的dev分支

## 修改系统时间

> 参考链接：
> [https://blog.csdn.net/weixin_35852328/article/details/79506453](https://blog.csdn.net/weixin_35852328/article/details/79506453)

1.  安装ntpdate工具
    >`yum -y install ntp ntpdate`

2.  设置系统时间与网络时间同步
    >`ntpdate cn.pool.ntp.org` 

3.  将系统时间写入硬件时间
    >`hwclock --systohc`

## yum 回滚

### 参考链接

[https://blog.csdn.net/typa01_kk/article/details/49057073](https://blog.csdn.net/typa01_kk/article/details/49057073)

1.  查看安装历史

    >`yum history list all`

2.  找到对应`id`进行回滚

    >`yum history undo id `

## gcc源码下载地址

>   [http://ftp.gnu.org/gnu/gcc/](http://ftp.gnu.org/gnu/gcc/)

## Linux系统启动挂载配置

>   `/etc/fstab`，这个文件是系统启动时候的挂载执行，如果需要挂载`win`的`ntfs`格式的文件[博客地址](http://39.106.165.33/#!./blog/Linux/./ntfs.md)
>
>   查看man手册`man 5 fstab`
>
>   文件格式(一般)：`硬盘设备 目标挂载点 挂载的文件格式 defaults 0 0`
>
>   ```
>
>   #
>   # /etc/fstab
>   # Created by anaconda on Thu Dec 31 19:09:56 2015
>   #
>   # Accessible filesystems, by reference, are maintained under '/dev/disk'
>   # See man pages fstab(5), findfs(8), mount(8) and/or blkid(8) for more info
>   #
>   UUID=d930a1fb-9c11-4ed7-888e-b5cf2c56c29e	 /           ext4    defaults      0 0
>
>   /dev/sda1 /mnt/Win_OS ntfs-3g defaults 0 0
>   /dev/sdb4 /mnt/Storehouse ntfs-3g defaults 0 0
>   /dev/sdb3 /mnt/VMware ntfs-3g defaults 0 0
>   /dev/sdb2 /mnt/Code ntfs-3g defaults 0 0
>   /dev/sdb1 /mnt/Software ntfs-3g defaultss 0 0
>   ```

## ssh登陆显示的信息

>   `ssh`远程登陆显示的内容为`/etc/motd`文件中的内容

## win7装系统发生错误

>   错误提示：
>
>   ```
>   计算机意外地重新启动或遇到错误。windows安装无法继续。若要安:装windows,请点击”确定“重新启动计算机，然后重新安装。
>   ```
>
>   教程链接：[点击前往](https://zhidao.baidu.com/question/1704988131511838940.html?qbl=relate_question_0&word=%BC%C6%CB%E3%BB%FA%D2%E2%CD%E2%B5%D8%D6%D8%D0%C2%C6%F4%B6%AF%BB%F2%D3%F6%B5%BD%B4%ED%CE%F3%2Cwindows%B0%B2%D7%B0%CE%DE%B7%A8%BC%CC%D0%F8)
>
>   *   第一步：`shift + F10`，打开`cmd`
>   *   第二步：输入`cd\`，并回车
>   *   第三步：输入`cd C:\windows\system32\oobe`，并回车
>   *   第四步：输入`msoobe`，并回车
>   *   第五步：进行安装，不要关闭错误的窗口，否则会重启。

## Linux设置打开默认文件

>   这里以`Typora`打开`markdown`为例

*   第一步：先写一个Typora的桌面文件`Typora.desktop`

    ```
    [Desktop Entry]
    Exec=/Software/Typora/Typora-linux-x64/Typora # 可执行程序的绝对路径和名字
    Name=Typora # 显示的文件名
    StartupNotify=false
    Terminal=false
    Type=Application
    Icon=/Software/Typora/icon_256x256.png # 桌面图标的绝对路径
    ```

*   第二步：把`Typora.desktop`文件放到`/usr/share/applications`中，需要管理员权限

*   第三步：修改`~/.local/share/applications/mimeapps.list`文件，添加行`text/x-markdown=Typora.desktop`，完成了再双击`*.md`文件的时候就是通过`Typora`打开的了。
