<p align="center">有关git的简单技术
=================
git 下载
-----------------
>此处放网址

 git 的操作
 ---------------
+ `git status` 查看git状态
+ `git commit`
+ `git add`
+ `git checkout`
+ `git branch`
+ `算了不列了 git --help 里都有----`
这是英文帮助文档--
-------------
>$ git --help

These are common Git commands used in various situations:

  这些是在不同状况下的git常见命令

start a working area (see also: git help tutorial)

  建立工作区
+   `clone`      Clone a repository into a new directory

把一个库克隆到一个新目录里
+   `init`       Create an empty Git repository or reinitialize an existing one

初始化一个新仓库或者重新初始化一个仓库

work on the current change (see also: git help everyday)

对改动进行的操作
+  ` add`        Add file contents to the index
+ 把文件添加到暂存区
+   `mv`         Move or rename a file, a directory, or a symlink
+ 移动
+   `reset`      Reset current HEAD to the specified state
+ 好像是用于版本回退
+   `rm`         Remove files from the working tree and from the index
+ 删除文件

examine the history and state (see also: git help revisions)
+   `bisect`     Use binary search to find the commit that introduced a bug
+ 不知道
+   `grep`       Print lines matching a pattern
+   `log`        Show commit logs
+ 显示向版本库提交的记录
+   `show`     Show various types of objects
+ 查看当前目录文件状态？
+   `status`     Show the working tree status
+ 查看git状态

grow, mark and tweak your common history
+   `branch`     List, create, or delete branches
+ 列出，创建，删除一个分支
+   `checkout`   Switch branches or restore working tree files
+ 切换分支
+   `commit`     Record changes to the repository
+ 把改动提交到版本库
+   `diff`       Show changes between commits, commit and working tree, etc
+ 查看commit的差别
+   `merge`      Join two or more development histories together
+   `rebase`     Reapply commits on top of another base tip
+   `tag`        Create, list, delete or verify a tag object signed with GPG
+ 不知道

collaborate (see also: git help workflows)
+   `fetch`      Download objects and refs from another repository
+ 从另一个仓库下载
+   `pull`       Fetch from and integrate with another repository or a local branch
+ 从另一个仓库下载并合并
+   `push`       Update remote refs along with associated objects
+ 提交到远程仓库



 git 文件存储
 ---------------
 配图
<img src=1352126739_7909.jpg>
