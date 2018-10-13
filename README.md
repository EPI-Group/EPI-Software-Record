**git与github的区别**

- 是一个版本管理工具，是可以在你电脑不联网的情下，只在本地使用的一个版本管理工具，其作用就是可以让你更好的管理你的程序，比如你原来提交过的内容，以后虽然修改了，但是通过git这个工具，可以把你原来提交的内容重现出来，这样对于你后来才意识到的一些错误的更改，可以进行还原。
- github是一个网站，每个人可以建立自己的网上仓库每次代码可以提交到仓库中。同时这也是个开源网站别人可以看你的代码并修改，若你同意则可以合并。  
  **git的发展历史**  
1. 1991年Linux创立了开源的Linux，Linux不断发展已经成为最大的服务器系统软件。
 2. 2002年由于Lniux代码库太大难以手动管理，于是Linux选择了一个商业的版本控制系统Bitkeeper,此时BitMover授权Linux社区免费试用这个版本控制系统。
3. 直到2005年,Bitkeeper被回收，GIT出现至今。
  ##一.Git的安装
  1.安装GIT网址:[git](https://git-scm.com/)。
  2.**安装步骤**
  ![2018-10-12.png](https://upload-images.jianshu.io/upload_images/14423235-79bce9c6e50b0ac0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (1).png](https://upload-images.jianshu.io/upload_images/14423235-a533befe99ac058d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (2).png](https://upload-images.jianshu.io/upload_images/14423235-373ee2246918aa75.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (3).png](https://upload-images.jianshu.io/upload_images/14423235-552a3bec7790ec60.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (4).png](https://upload-images.jianshu.io/upload_images/14423235-cc4ec042f681cfb1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (5).png](https://upload-images.jianshu.io/upload_images/14423235-e265cfc1f339f6b4.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (6).png](https://upload-images.jianshu.io/upload_images/14423235-d86560044c12616b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (7).png](https://upload-images.jianshu.io/upload_images/14423235-ab29382b03d95162.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (8).png](https://upload-images.jianshu.io/upload_images/14423235-b24bfabf1a3b8335.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (9).png](https://upload-images.jianshu.io/upload_images/14423235-21425092f60be54e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  ![2018-10-12 (10).png](https://upload-images.jianshu.io/upload_images/14423235-655139575cccd0a7.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

  ### 二.Github的注册

     可参考:[链接](https://blog.csdn.net/hxkqq457624390ok/article/details/55002499)

  ### 三.github上添加SSH Key

  ***1.检查电脑是否有SSH key***
  任意处运行git Bush客户端,输入以下代码:
  `* cd ~/.ssh`
  ` *ls`
  ***2.创SSH key***
  `* ssh-keygen -t rsa -C "your_email@example.com"` ==注意是大写C哦==
  参数的含义:
  -t 指定密钥类型，默认是 rsa ，可以省略。
  -C 设置注释文字，比如邮箱。
  -f 指定密钥文件存储文件名。(-f可以省略，那么就会生成 id_rsa 和 id_rsa.pub 两个秘钥文件。)
  接着又会提示你输入两次密码，（该密码是你push文件的时候要输入的密码，而不是github管理者的密码，然后咱们可以不输入密码，直接按两次回车。那么咱们push   的时候就不需要输入密码了）
  `Enter passphrase (empty for no passphrase):` 
  `# Enter same passphrase again:`
  然后显示代码如下:
  `Your identification has been saved in /c/Users/you/.ssh/id_rsa.`
  `# Your public key has been saved in /c/Users/you/.ssh/id_rsa.pub.`
  `# The key fingerprint is:`
  `# 01:0f:f4:3b:ca:85:d6:17:a1:7d:f0:68:9d:f0:a2:db your_email@example.com`
  下面为配图:![2018-10-12 (11).png](https://upload-images.jianshu.io/upload_images/14423235-fe22cdbea0930a68.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
  **3.**添加SSHkey到github上
  a.将rsa.pub打开并复制其全部代码
  b.登录github，点击右上角的(Settings)进入，然后点击左侧菜单栏的SSH key进行添加
  c.点击 Add SSH key 按钮添加一个 SSH key 。把你复制的 SSH key 代码粘贴到 key 所对应的输入框中，记得 SSH key 代码的前后不要留有空格或者回车。
  ##三.将本地文件上传至github
  1.在文件夹出右键单击git Bush.
  2.`echo "输入仓库名">>README.md`(创建本地.md文本)
  3.`git init` (初始化，会在此文件夹中建一个隐藏的**.git文件**)
  4.`git add .`(使之加入缓存供commit提交时寻找)
  5.`git status`(每次加入缓存最好查看一下状态，若未加入显示**红色**，若被加入缓存则会变成绿色)
  6.`git commit -m "注释一些信息"`
  7.`git remote add origin 克隆的地址`(连接远程仓库)
  8.`git push origin master`(将本地的master推送到origin主机) 
----
**补充**：a. `git status`用于查看文件状态，
​                     若没被改动则输出:`On branch master`
​                                                   `nothing to commit ,working tree clean`。
b.`git diff`用于查看`git status`的详细信息,
尚未缓存的改动:`git  diff`
查看已缓存的改动:`git diff --cachded`
查看已缓存和为缓存的改动:`git diff HEAD`

取消已缓存:`git reset HEAD`

### 四.分支管理

 1.`git branch`(创建分支)[列出当前分支清单]
​        2.`git branch -a`(既能查看远程分支又能查看本地分支，remote意为远程)

        3. `git checkout -b 分支名字`(创建并切换至此分支)
                4.`git status`(每次提交时最好查看一下状态)
        ​        5.`git add .`(加载进缓存)  
        ​        6.`git status`
        ​        7.`git commit -m  注释`
        ​        8 .`git push origin 分支名字`
        ​        9.`git branch -a`(查看分支情况)
***补充***:a.切换分支`git checkout 分支名字`
                ​                b.`git merge 分支名字`(合并某分支到当前分支)
                ​                c.`git branch -d 分支名字`(删除分支)
