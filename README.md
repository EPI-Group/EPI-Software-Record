#关于Git的学习
经过这几天对git的学习终于对他有了一个初步的认识。
git是在cvs和svn之后的一个新的版本控制系统。
个人认为所谓的版本控制就是远程仓库和本地仓库之间的更新，更新也就是自己在本地仓库进行一系列的操作保存的文件，在远程仓库那边并没有收到，这就需要需要git进行操作，将本地的文件push到远程仓库中。
##配置git
登陆www.git-scm.com网址
![捕获1.PNG](https://upload-images.jianshu.io/upload_images/14449805-30ed116bd224acbd.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
进入下载页面
![捕获2.PNG](https://upload-images.jianshu.io/upload_images/14449805-64aaac0771a5a266.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
然后进行下载安装
安装好了之后在桌面上点击右键
点击菜单里面"Git Bash Here"这一项
![捕获3.PNG](https://upload-images.jianshu.io/upload_images/14449805-9c4e0da20257c434.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
这就进行了简单的配置
##git的一些常用基本命令
####git init
在当前文件夹下创建一个“.git”的文件
####git clone
这个命令后面还要跟上一个远程仓库的地址连接
将远程仓库克隆到本地
####git status
查询当前本地文件所处的状态
####git add .
将上一次的所有改动放入暂存区
####git commit
提交已经被add进来的改动到本地仓库
####git branch
* git branch ：列出本地所有分支，当前分支会被星号标示出
* git branch -v ：可以看见每一个分支的最后一次提交
* git branch （branchname）：创建一个分支
* git branch -d （branchname）：删除一个分支
  ![捕获1.PNG](https://upload-images.jianshu.io/upload_images/14449805-7810cdbdb97144dd.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

![捕获2.PNG](https://upload-images.jianshu.io/upload_images/14449805-118283e31b480432.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
####git checkout
* git checkout (branchname):切换到一个分支 
* git checkout -b (branchname):创建并且换到新的分支
  ![捕获3.PNG](https://upload-images.jianshu.io/upload_images/14449805-f99679232fe2dce5.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
####git push
将自己本地分支上的内容更新到远程仓库上的分支，如果分支已经存在,将会更新,如果不存在,将会添加这个分支
####git的工作流程
我们在本地进行的操作是在git的工作目录上进行的，然后执行git add .会将我们进行的操作保存到暂存区,然后执行git commit -m'  ',会提交到本地仓库，最后再执行git push origin （分支名）会提交到远程仓库中
![捕获4.PNG](https://upload-images.jianshu.io/upload_images/14449805-0f740d2e87ddefcd.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
以上就是我暂时对git的认识，在之后的时间里我会更加深入的去学习、了解git