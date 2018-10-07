一.Git（分布式管理版本控制系统)
       Git(读音为/gɪt/。)是一个开源的分布式版本控制系统，可以有效、高速的处理从很小到非常大的项目版本管理。 [1]  Git 是 Linus Torvalds 为了帮助管理 Linux 内核开发而开发的一个开放源码的版本控制软件。
         Git 是用于 Linux内核开发的版本控制工具。与常用的版本控制工具 CVS, Subversion 等不同，它采用了分布式版本库的方式，不必服务器端软件支持（wingeddevil注：这得分是用什么样的服务端，使用http协议或者git协议等不太一样。并且在push和pull的时候和服务器端还是有交互的。），使源代码的发布和交流极其方便。 Git 的速度很快，这对于诸如 Linux kernel 这样的大项目来说自然很重要。 Git 最为出色的是它的合并跟踪（merge tracing）能力。
特点：
        分布式相比于集中式的最大区别在于开发者可以提交到本地，每个开发者通过克隆（git clone），在本地机器上拷贝一个完整的Git仓库。
功能：   
        1、从服务器上克隆完整的Git仓库（包括代码和版本信息）到单机上。
        2、在自己的机器上根据不同的开发目的，创建分支，修改代码。
        3、在单机上自己创建的分支上提交代码。
        4、在单机上合并分支。
        5、把服务器上最新版的代码fetch下来，然后跟自己的主分支合并。
        6、生成补丁（patch），把补丁发送给主开发者。
        7、看主开发者的反馈，解决冲突，解决完冲突之后再向主开发者提交补丁。
二.Git的常用命令
     1.配置信息
         git --version（查看git版本信息)   
         git config --global user.name/user.email(获取当前用户名/邮箱) 
     2.登录Git
        git config --global user.name "自己的用户名"
        git config --global user.email "自己的邮箱"
     3.Git工作区仓库的建立
        进入指定文件夹，使用git  init 命令创建
     4.文件的提交
     git的3大区域
     1、工作区（working directry） 
     2、暂缓区（stage index） 
     3、Git仓库(
     提交命令:
          git add . (添加所有工作区文件到暂存区)
          git add filename(添加工作区指定文件至暂存区)
         git  commit -m "描述语句（解释文件/文件的具体更改)"     (添加暂存区所有文件到Git仓库)
         git commit -am "描述语句（解释文件/文件的具体更改)"    （添加工作区修改的文件到Git仓库)
     5.文件的 回退版本，撤销，删除操作等
       1.回退版本:
       格式1: git reset --hard HEAD^
       解释:
         HEAD表示当前最新版本
         HEAD^表示当前最新版本的,  上一个版本
         HEAD^^表示当前最新版本的, 前两个版本, 依次类推
         HEAD~1 表示当前最新版本的,  上一个版本
         HEAD~2 表示当前最新版本的, 前两个版本, 依次类推
    
       格式2: git reset --hard 版本号  
       注意: 版本号很长, 指定的大于等于7未即可

       2.撤销修改
       撤销工作区:(本质将暂存区的文件覆盖工作区文件)
       格式: git checkout 文件名
       撤销暂存区:
       格式: git reset HEAD 文件名  #将暂存区的代码撤销到工作区
        git checkout 文件名   #撤销工作区代码
       注意: 
         只能撤销工作区, 暂存区的代码, 不能撤销仓库区的代码
       撤销仓库区的代码就相当于回退版本操作
       3 .删除文件:
        格式1: rm filename  #直接删除磁盘文件,linux指令
        格式1:git rm filename   #删除暂存区文件
        
       如果误删,撤销:
       格式1: rm 文件名 #误删,未提交
         git checkout filename--文件名 #撤销
        
       格式2: git rm 文件名 #误删
       恢复: git reset --hard HEAD^  #撤销
     6.文件的状态，以及版本状态与对比查询
      1.文件状态查询命令：
       git  status(查看文件状态状态)
       文件状态分为四中:
       untracked(未被跟踪的）
       modified（文件已经修改，为添加到暂存区的)
       staged (在暂存区未提交到版本库的)
       commitited(git版本库中)
    2.版本状态查询命令：
      git log (查看版本信息，提交时间等等）
      git reflog(查看所有的版本信息，包括删除的版本)

    3.对比版本
      对比版本库与工作区代码差异:
      格式: git diff HEAD -- xxx.py
      格式解释: HEAD表示版本库,    xxx.py表示工作区
      出现绿色加号(+) 表示工作区相对于版本库增加的代码
      对比版本库:
      格式: git diff HEAD  HEAD^ -- login.py
      HEAD: 表示当前版本
      HEAD^:表示上个版本
      login: 表示对比的文件
三.Git的远程简单操作
（1) 远程仓库相关命令
检出仓库：$ git clone [url](仓库的地址)    (将仓库的文件下载到指定的文件夹，即本地工作区)
查看远程仓库：$ git remote -v
添加远程仓库：$ git remote add [name] [url]
删除远程仓库：$ git remote rm [name]
修改远程仓库：$ git remote set-url --push [name] [newUrl]
拉取远程仓库：$ git pull [remoteName] [localBranchName]
推送远程仓库：$ git push [remoteName] [localBranchName]
(2)分枝操作
   git branch（查看本地分枝)
   git branch -r (查看远程分枝)
   git branch [newname]（创建一个名字未newname的分枝,HEAD不会自动指向此分枝)
   git checkout name (切换分枝)
  git branch -d name(删除分枝，不能删除当前指向的分枝）
  合并分支：git merge [name] ----将名称为[name]的分支与当前分支合并
  创建远程分支(本地分支push到远程)： git push origin [name]
  删除远程分支： git push origin :heads/[name] 或 [git push origin :[name] 

------------------------------------------------------------文章未完成将不断更新，后期将完善内容------------------------------------------------------------
