# 一、Git是什么？

* Git是目前世界上最先进的分布式版本控制系统。

Git是免费、开源的

最初Git是为辅助 Linux 内核开发的，来替代 BitKeeper。适合分布式开发，强调个体。公共服务器压力和数据量都不会太大。速度快、灵活。任意两个开发者之间可以很容易的解决冲突。离线工作。

# 二、Git的安装？

##### 1. 下载Git

[Git官网连接](https://git-scm.com/)

点击右下角Download，下载git对应操作系统的版本。

##### 2. 安装成功后在右键桌面有git命令

##### 3. 验证Git的安装正确，按下win键+r  打开cmd(运行窗口)输入下列指令：`git --version`

* 若安装正确会出现下面的图(1)![9SGAU{5$I([LZ]~BRF%{$AE.png](https://upload-images.jianshu.io/upload_images/14299729-62b93066d26be587.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


# 三、Github的使用
添加远程库
做全局的配置
 git config --global user.name "zhangsan"
git config --global user.email "zhangsan@139.com"
git remote add origin git@github.com:zhangsan/ylez.git // 添加一个远程仓库
  // add origin 就是添加一个远程仓库
  // git@github.com:zhangsan/ylez.git  是远程仓库的地址
  // git@github.com 主机的地址  我们可以通过GitLab大家自己的git服务器
  // zhangsan 是你的用户名
  // /ylez.git 是你的仓库名
git push -u origin master  // 将本地的master分支推送到远程的master分支中
git push -u origin dev    // 本地切换到dev分支然后将本地的dev分支推送到远程

Git大致工作流程
从工作区添加文件到暂存区，然后把在存取整体的状态提交的历史记录里面。然后我们还可以吧历史记录里面的文件检出（checkout）到暂存区和工作区间。大多数时间我们都是把往暂存区中添加东西然后把暂存区提交到历史记录里面。对应的就是：git add（-A 将整个工作区添加到暂存区）和git commit 这个两个命令。
#四，git具体使用


以下是一些常用的git命令：

mkdir nodejs    //创建文件夹nodejs
cd nodejs       //切换到nodejs目录下
ls -al    //查看目录
>echo "hello git"
> index.html       //将'hello git' 写入到index.html中
### 查看文件内容
与GitHub有关的：

先有本地库，后有远程库，将本地库push到远程库

关联本地仓库和GitHub库：git remote add origin 网站上的仓库地址
第一次将本地仓库推送到GitHub上：git push –u origin master

先有远程库，后有本地库，从远程库clone到本地库

从远程库克隆到本地：git clone 网站上的仓库地址

    网站地址可以选择HTTPS协议（https://github.com...）、SSH协议（git@github.com...）。
    如果选择SSH协议，必须将Ubuntu的公钥添加到GitHub上。见下一步

SSH Key

生成SSH Key：ssh-keygen –t rsa –C "你的邮箱@xx.com"
生成Key时弹出选项，回车选择默认即可。
Key保存位置：/root/.ssh
登陆GitHub，创建new SSH key，其内容为/root/.ssh/id_rsa.pub中文本

已经有了本地库和远程库，二者实现同步

本地库的改动提交到远程库：git push origin master
更新本地库至远程库的最新改动：git pull
与添加有关的：

将当前目录变为仓库：git init
将文件添加到暂存区：git add 文件名 [可选：另一个文件名]
将暂存区提交到仓库：git commit –m "描述"

查看所有的stash
 git stash list  // 列出所有的工作现场存储
 git stash list  // 恢复工作现场(只有一个的时候可以省略后面的,如果有多个可以恢复指定的某一个stash)但是不删除存储中的stash
 git branch -d branchName  // 删除某一个分支,前提是在该分支和产生该分支的主分支已经合并了(merge)
 git branch -D branchName  // 删除某一个分支,无论是否合并都强制删除


