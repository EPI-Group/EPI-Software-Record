# git学习总结
<font size=5> 经过两周的git学习，我大概学会了git的一些基本操作，以下是我在这两周的学习中所运用到的一些git命令。

### 1.初始化
* `git clone 网址` 把远程仓库中的文件下载到本机上。
* `git init` 创建仓库并初始化.git文件，初始后需要重新与远程仓库建立联系。（在初始化仓库时，git会为我们自动创建一个master分支）
![](https://img-blog.csdn.net/2018101108473978?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 2.提交
* `git add 文件名` 把某个修改文件提交到暂存区（文件名要包括==拓展名==）
* `git add .` 把所有修改的文件添加到暂存区
* `git commit -m'这里输入说明'` 将暂存区的内容提交到本地仓库的当前分支（commit后会清除暂存区里的内容）
* `git commit -a` 提交时显示所有diff信息
* `git push -u origin 分支名` 把本地仓库的文件提交到GitHub的该分支上（push前要先切换到该分支上）
* `git remote add origin SSH网址` 将本地仓库和远程仓库关联（一个本地仓库只能和一个远程仓库关联）

### 3.分支
 - `git branch` 查看本地分支，`*`指目前所在分支
![](https://img-blog.csdn.net/2018101114594543?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
- `git branch -r` 列出所有远程分支
 - `git branch 分支名` 创建新的分支
 - `git checkout 分支名` 切换到该分支
 - `git checkout -b 分支名` 创建并切换到该分支
 - `git branch -d 分支名` 删除该分支
 - `git merge 分支名` 将指定分支合并到当前分支
![](https://img-blog.csdn.net/20181011153440347?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
   >如图1haofenzhi被合并到master分支
### 4.查看信息
-  `git status` 查看仓库的当前状态 分别有以下状态：
   >1.`Changes not staged for commit` 文件位于工作区域
![](https://img-blog.csdn.net/20181011080426579?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 2.`Changes to be committed` 文件位于暂存区
![](https://img-blog.csdn.net/2018101108092713?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 3.`nothing to commit, working tree clean` 没有什么需要提交的，说明文件位于本地仓库
![](https://img-blog.csdn.net/20181011081117602?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 -  `git log` 显示版本历史，时间由最近到最远
![](https://img-blog.csdn.net/20181010232126983?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
- `git log --pretty=oneline` 将commit信息变成一行
![](https://img-blog.csdn.net/2018101310244275?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 - `git reset --hard HEAD^`  版本回退，用`HEAD`表示当前版本，则`HEAD^`表示上一个版本，`HEAD^^`表示上上一个个版本，用`HEAD~100`表示当前版本的上一百个版本。
 - `git reset --hard HEAD ID` 指定回到新的版本（指上一步被回退的版本），ID指图中的==黄色数字==，这是一串16进制数字，每个人的都不相同，进行指令时只需输入前6~7位数字就够了。
![](https://img-blog.csdn.net/20181011082836228?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
 - `git reflog` 用于查看命令的历史，以便确定回到哪个版本
![](https://img-blog.csdn.net/20181011083839137?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
### 5. SSH密钥设置
   1. 输入`cd ~/.ssh` 检查是否有密钥，有就直接备份
   2. 输入`ssh-kenyen -t rsa -C "邮箱"` id_rsa文件即是你的私有密钥，id_rsa.pub是共开密钥
![](https://img-blog.csdn.net/20181012092258773?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
    3. 输入`vim id_rsa.pub` 查看密钥（输入==shift+ZZ==即可退出）
![](https://img-blog.csdn.net/2018101209285624?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MzMyMjk1OQ==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)
   4. 进入GitHub设置界面，在SSH处添加新密钥
### 6.其他操作
- `git diff 文件名` 查看具体修改的内容
-  `vim 文件名` 修改文件内容
- `cat 文件名` 查看文件
- `cd 文件名` 进入该文件目录下
- `cd ../` 返回上级目录
### 7.修改
 - `git checkout -- 文件名` 把文件在工作区的修改全部撤销
   >1.一种是文件自修改后还没有被放到暂存区，现在，撤销修改就回到和版本库一模一样的状态；
   >2.一种是文件已经添加到暂存区后，又作了修改，现在，撤销修改就回到添加到暂存区后的状态。
  - `git reset HEAD 文件名` 可以把暂存区的修改撤销掉，重新放回工作区

## 总结

 <font size=5>虽然git的学习比较困难（尤其是那一长串全英文的错误提示让我不知所措），但成功的把文件上传到GitHub上的成就感还是很不错的，在之后的学习中我会继续git方面的学习，更加熟练的掌握它。
---
原文网址： 
[https://blog.csdn.net/weixin_43322959/article/details/83000413](https://blog.csdn.net/weixin_43322959/article/details/83000413)