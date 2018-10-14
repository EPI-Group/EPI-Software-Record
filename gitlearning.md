#什么是git?  

1. Git是一个开源的分布式版本控制系统，用于敏捷高效地处理任何或小或大的项目。

0. Git 是 Linus Torvalds 为了帮助管理 Linux 内核开发而开发的一个开放源码的版本控制软件。

0. Git 与常用的版本控制工具 CVS, Subversion 等不同，它采用了分布式版本库的方式，不必服务器端软件支持。  

---

#git的下载

1. git下载地址：<https://git-scm.com/download/win>  
   注：  
Windows7是32位系统，所以下载[32位](https://github.com/git-for-windows/git/releases/download/v2.19.1.windows.1/PortableGit-2.19.1-32-bit.7z.exe)。  
Windows10是63位系统，所以下载[64位](https://github.com/git-for-windows/git/releases/download/v2.19.1.windows.1/PortableGit-2.19.1-64-bit.7z.exe)。

---

#git注册
1. **git  config --global user.email** 邮箱//注册邮箱  
0. **git config --global user.name** 用户名//注册用户名   


---

#git基本操作
1. **git init** //初始化为git仓库
2. **cd dirname** //切换文件夹
3. **touch filename.fileformat** //创建文件
4. **vi filename.file format** //编辑文件
5. **git status** //检查修改状况
6. **pwd** //查看当前所处文件夹
7. **mkdir fileformat** //创建文件夹
8. **rm filename.fileformat** //删除文件

---

#git文件存储  
![wait..](https://cdn.liaoxuefeng.com/cdn/files/attachments/001384907702917346729e9afbf4127b6dfbae9207af016000/0)

#git文件的提交  
1. **git add filename.fileformat** //将文件从工作区移至暂存区
2. **git add .** //将文件（所有在工作区的文件）移至暂存区
3. **git commit -m"注释"** //将文件从暂存区移至git仓库,并做注释
4. **git commit** //将文件从暂存区移至git仓库  
   注：此命令回车后，需进行注释，以下是注释时所需要的操作。  
**shift g** //将光标移至标识行最下行  
**o** //进行编辑  
**ESC** //退出编辑状态  
**shift zz** //保存并退出编辑版  

---

#git状态查看

**git status** //查看文件修改状态

1. **untracked files** (文件在工作目录)
2. **working tree clean** (工作目录很干净，无修改)
3. **change to be commited** (文件在暂存区)
4. **changes not to be commited** (已在工作目录中修改文件，但未暂存)

**git log** //查看已提交内容  
**cat filename.fileformat** //查看文件内容   
**git branch** //查看全部分支  
**ll** //产看工作目录，及当前分支下所有文件  
**git diff** //查看工作区与暂存区的差异  
**git diff HEAD** //查看工作区与本地仓库之间的区别  
**git rm --cashed** //查看暂存区与本地仓库的差异

---

#git分支

###什么是分支？  
+ 分支是一个文本文件  
  文件名：分支名；    文件内容：SHA hash值

###分支操作

1. **git checkout -b branchname** //创建分支并跳转至新创分支  
2. **git checkout branchname** //跳转分支  
3. **git branch -d branchname** //删除分支  
1. **git branch -D branchname** //强制删除分支  
1. **git branch -r -d origin/branchname** //删除远程分支 
2. **git merge branchname** //合并分支
3. **git merge --merge** //取消合并分支

---

#本地仓库与远程仓库连接

1. **git clone url** //克隆远程仓库上的内容，并连接本地仓库与远程仓库  
2. **git remote add origin url** //直接连接本地仓库与远程仓库  
3. **git push** //将本地仓库上的文件上传至远程仓库
4. **git push  origin branchname** //将本地已修改的文件和新分支传输到远程仓库上
5. **git push -f origin branchname** //强制推送  
4. **git pull**//将远程仓库上的文件上传至本地仓库 

---

#stash命令

1. **git stash** //将工作区与暂存区的内容保存到stash列表
2. **git stash list** //查看stash列表
3. **git stash show -p stash@[n]** //查看第n次修改次，及其储存内容
4. **git stash pop** //从stash列表中弹出第一个储存内容并应用
5. **git stash apply stash@[n]** //从stash列表中复制一个储存项，并应用
6. **git stash drop stash@[n]** //从stash中删除第n项储存项

---

#版本回退

###reset

1. **git reset** //版本回退命令
2. **git reset --hard HEAD^** //返回上一个版本
3. **git reset --HEAD~n** //返回至第n个版本

###revert

1. **git revert HEAD** //返回前一次 commit
0. **git revert HEAD^** //返回前前一次 commit
1. **git revert HEAD~n** //返回至第n个版本

###reset和revert的区别

- revert：用于在当前版本前，创建一个新的旧版本，将HEAD指针移至退回的版本上
- reset:用于直接跳回旧版本上，并将HEAD指针移植到修改版本上

---

#配置命令别名

- **git config --global alias.别名 命令** //自定义命令


 













   
