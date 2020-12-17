# Git

标签（空格分隔）： git

---

##1.向仓库中添加文件流程
>* 工作区（Working Diretory）
>* 暂存区
>* Git Repository（Git仓库）

配置Git：
   > git config --global user.name "Your Name"
   > git config --global user.email "email@example.com"
##2.提交步骤
>* mkdir test
>* git init
>* git add a1.java
>* git commit -m '提交'
>* git status（查看状态）

##3.Git远程仓库
>* 链接远程仓库：git remote add origin https://github.com/Coding-JH/Java-.git
>* 上传到服务器：git push -u origin master 
>* 克隆仓库：git clone
https://github.com/Coding-JH/Java-.git
>* 从服务器上获得修改：git pull origin master
 
 -  查看配置：git config --list
 - 查看内容：cat a1.java
##4.分支
>* 创建新分支 – git branch name
>* 切换分支 – git checkout name
>* 合并分支 – git merge new_name 要合并的名字
>* git branch -d new_name 合并后删除
>* git log --oneline decorate    来查看会有哪些分支，和这些分支在哪个commit上                 

----
##简单总结步骤
>* git remote add epi https://github.com/EPI-Group/EPI-Software-Record.git
>* git add .
>* git commit -m '描述'
>* git push -u epi master