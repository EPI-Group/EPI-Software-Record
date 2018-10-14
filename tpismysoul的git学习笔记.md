#tpismysoul的git学习笔记
##一.git的简介
###1.git的起源
* Linus在1991年创建了开源的Linux，从此，Linux系统不断发展，成为了最大的服务器系统软件  
* 在2002年以前，世界各地的志愿者把源代码文件通过diff的方式发给Linus，然后由Linus本人通过手工方式合并代码！因为CVS和SVN这些集中式的版本控制系统不但速度慢，而且必须联网才能使用。付费的又和Linux的开源精神不符。   
* 所以Linus花了两周时间自己用C写了一个**分布式版本控制系统**，这就是Git！一个月之内，Linux系统的源码已经由Git管理了！  
* Git迅速成为最流行的分布式版本控制系统，尤其是2008年，GitHub网站上线了，它为开源项目免费提供Git存储，无数开源项目开始迁移至GitHub，包括jQuery，PHP，Ruby等等
###2.分布式VS集中式 
* **集中式**版本控制系统：
* *版本库是集中存放在中央服务器的，而干         活的时候，用的都是自己的电脑，所以要先从中央服务器取得最新的版本，然后开始干活，干完活了，再把自己的活推送给中央服务器。*  
* **缺点：*****1.必须联网，导致网速限制工作效率2.中央服务器要是出了问题，所有人都没法干活。***
* **分布式**版本控制系统：
* *每个人的电脑上都是一个完整的版本库，工作的时候，就不需要联网，至于协作，比方说你在自己电脑上改了文件A，你的同事也在他的电脑上改了文件A，这时，你们俩之间只需把各自的修改推送给对方，就可以互相看到对方的修改*
##二.安装git
###1.下载并安装git  
* https://git-scm.com/downloads
* 安装时除了设置文件**储存路径**外一路敲回车
* 安装完成后，在开始菜单里找到“**Git”->“Git Bash**”，蹦出一个类似命令行窗口的东西，就说明Git安装成功！
###2.设置用户信息
          $ git config --global user.name "Your Name"  用户名  

          $ git config --global user.email "email@example.com" 邮箱地址  
* 之后你这台机器上所有的Git仓库都会使用这个配置
##三.创建仓库并管理
###1.创建仓库并添加文件
① 创建版本库：

     创建一个空文件夹(也可以直接使用非空文件夹)：mkdir learngit

     切换到此文件夹：cd learngit

     仓库将创建在这个目录内。

     创建仓库：git init

-------目前为止，仓库已经创建好了，路径是 /learngit/.git ，如果没有看到.git目录，那是因为.git被隐藏了，使用 ls –ah 就能看到被隐藏的目录了。

② 把文件添加到版本库：

     在 learngit 目录或者其子目录下创建一个文件 readme.txt 。

     在 readme.txt 内编写内容：

          Git is a version contorl system.

          Git is a free software.

     把文件添加到仓库：

          -1- 添加文件到仓库 git add readme.txt

          -2-向仓库提交文件 git commit -m "wrote a readme file"

               -m 后面双引号内是本次提交的说明。
###2.查看文件状态
把之前创建的文件 readme.txt 文件内容修改为→：

Git is a distributed version control system.
Git is free software.  

然后用指令 **git status** 查看现在的**仓库状态**，得到这个信息：  

![](https://images2015.cnblogs.com/blog/1085652/201701/1085652-20170116220224802-1434233648.png)   
 

上面返回信息中的 ***modified：readme.txt*** 说明文件已经被修改。但是还没有向仓库提交。
  
查看修改内容: **git diff**  
 
![](https://images2015.cnblogs.com/blog/1085652/201701/1085652-20170116220225692-423788178.png)  

红色代表修改之前的代码，绿色是修改之后的代码。现在可以向仓库提交文件了。

提交修改后的文件和提交新文件一样，**①git add readme.txt  ②git commit -m "add distributed"**

提交完成后，再次输入 **git status** 查看当前仓库状态：  
![](https://images2015.cnblogs.com/blog/1085652/201701/1085652-20170116220226552-1826539844.png)
  
此时提示中已经没有尚未提交的修改了。OVER~
###3.版本回退  
使用 **git log** 命令可以查看文件改动的日志。（或者添加 --pretty=oneline让每一条返回结果在一行显示）  
![](http://images2015.cnblogs.com/blog/1085652/201701/1085652-20170117114320099-1683166276.png)  
黄颜色的命令行 commit 后面的十六进制字符串是系统通过SHA1计算得到的 commit id 。

在git中 **HEAD** 表示当前版本。上个版本是 **HEAD^** ，再上一个版本是 **HEAD^^**  ……。

当数量很大的时候，用 ~：比如往上数100个版本→HEAD~100。

**版本回退**

版本回退命令：**git reset** ，回退到上个版本：**git reset --hard HEAD^**

如果此时想再回到最新版本，要使用 **commit id ：git reset --hard 559d4192**，commit id 只需要些前几位就可以了。

**代码历史记录**

如果忘记了commit id，可以查看代码历史记录：**git reflog** 。  
###4.管理修改
* **提交修改**  
文件修改后，git add 把文件添加到了stage，此时尚未commit。

     此时如果把文件进行二次修改。然后 commit 。第二次修改之后的文件并未提交。

     解决方法：再次 git add →git commit 。  
* **撤销修改**  
**git checkout --filename** 这个命令能丢弃工作区的修改。（checkout实际上是用版本库中的文件替换工作区的文件）

    当文件被做出了一些不需要的修改，可以用 git checkout --filename 来丢弃那些修改（这是文件并未 add 的时候）。

    当文件做出了不需要的修改，并且已经 add 到暂存区了。这时候需要把暂存区的修改回退到工作区，然后 checkout 文件所修改的内容。

       （文件 add 之后）步骤：① git reset HEAD filename②git checkout --filename  
* **删除文件**  
当删除一个仓库内的文件时：①为add到stage内，随便删就是了。②已经add到stage内，并且已经commit到master中。

     首先 **rm filename**，然后看一下仓库状态，你会得到这样的返回：  
![](http://images2015.cnblogs.com/blog/1085652/201701/1085652-20170117144521099-273500567.png)  
此时有两个选择，也就是返回信息中连续的两个括号中的提示指令：

      ①从版本库中删除文件，用 **git rm filename** 然后 **git commit** 。

       ②失误删除，需要找回文件，用 **git checkout --filename**。  
##四.本地repository和gihub repository关联同步  
**创建SSH Key** ：在 git bash中输入指令：

      ssh-keygen –t rsa –C " your email address"
然后一路回车，在user/userName/下创建了/.ssh/文件夹。

   文件夹里包含两个文件 id_rsa 和id_rsa.pub。分别是私钥和公钥。

在github的 settings/SSH and GPG keys/ 点击 New SSH key ，title随便写，把公钥填进去,这样就添加了SSH key。

 **github远程仓库同步**

*  在github创建一个空的仓库，创建完成后来到这个界面  
![](http://images2015.cnblogs.com/blog/1085652/201701/1085652-20170117160845396-1539458088.png)  
* 在本地仓库下的 git bash中输入指令：  
*   
        it remote add origin git@github.com:mackieLi/learngit.git
remote：远程 origin：本地  
* 接下来就可以把本地仓库推送到远程仓库中了

        git push -u origin master  

      以后每次对 master 做出改动，就运行

        git push origin master
**克隆仓库**

        git clone link
##五。分支
###1.分支管理  
创建、合并、删除分支。  

 * **创建分支**

     **git branch branchName --------创建分支**

    **git checkout branchName -----切换到分支**

     **上面两条命令可以合并为：git checkout -b branchName 创建并切换到分支**

 * **合并分支**

    **git merge branchName -------合并指定分支到当前分支**

* **删除分支**

    **git branch -d branchName**

* **查看所有分支**

      **git branch**

* **git stash 功能**    
      **git stash 功能把当前未完成的工作隐藏起来。**  

     **git stash list 列出隐藏的工作**

 *      **把隐藏内容重新显示：  
       方法一 git stash apply 然后 git stash drop  
       方法二 git stash pop 这条命令同时也将stash清空了**                             

*        **可以多次 git stash ，然后利用 git stash list 查看，恢复指定的 stash**

* **conflict fix**

      当两个分支产生冲突，无法merge时，打开文件，修改冲突代码，然后 add，commit。  
* **分支管理原则**  
###2.分支标签管理  
* **给分支添加标签**

     首先要处于你要添加的那个分支上，然后运行 **git tag tagName**

     运行 **git tag** 来查看标签

    默认情况下，标签是添加在最新的commit上，如果想在历史版本上添加标签，首先 **git log --pretty=oneline --abbrve-commit**

    在找到commit id之后， **git tag tagName commitID **这样通过在指令后面添加 commit id 的方式给历史版本添加标签

    运行 **git show tagName** 来显示指定标签的对应的版本信息

    运行**git tag -a tagName -m "discription" commitID** 给指定的 commit 添加描述信息 **-a  指定标签名字**  

    运行 **git tag -s tagName -m "discription" commitID** 给指定的 commit 用私钥签名并添加信息  
   **-s 私钥签名**

* **删除标签**

    删除本地标签 **git tag -d tagName**

    推送标签到**remote git push origin tagName** 或者 **git push origin --tags** 一次推送所有标签到remote

    删除romote的tag **git push origin :refs/tags/tagName**  （比如： git push origin :refs/tags/v1.0)  
##六.配置命令别名  
**git config --global alias.别名 命令**  

例如：git config --global alias.lg "log --color --graph --pretty=format:'%Cred%h%Creset -%C(yellow)%d%Creset %s %Cgreen(%cr) %C(bold blue)<%an>%Creset' --abbrev-commit"

--global 使命令在当前用户有效，如果没有--global那么只在当前repository有效

配置文件在 .git/config文件中 运行 cat .git/config 后，[alias]后面的内容就是别名。  
  
**原文地址**：[https://blog.csdn.net/qq_40413892/article/details/83046937](https://blog.csdn.net/qq_40413892/article/details/83046937)