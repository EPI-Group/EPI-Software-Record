## Git拷贝远程分支到本地

> `git checkout -b dev origin/dev`，作用是checkout远程的dev分支，在本地起名为dev分支，并切换到本地的dev分支

## 修改系统时间

> 参考链接：
> [https://blog.csdn.net/weixin_35852328/article/details/79506453](https://blog.csdn.net/weixin_35852328/article/details/79506453)

1.安装ntpdate工具
> `yum -y install ntp ntpdate`

2.设置系统时间与网络时间同步
> `ntpdate cn.pool.ntp.org` 

3.将系统时间写入硬件时间
> `hwclock --systohc`
