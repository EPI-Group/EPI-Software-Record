#我的git学习


----------

##我看git
 *git是一个开源的分布式版本控制系统，较之集中式系统，它能更便捷高效地适应当前组织合作的要求，并极好地突出个体的作用，高效灵活但保密性差，对学习者的要求高。*
*以下是我对自己学习做的总结*


----------

 
##git的基本操作
####**准备工作**
 1. `git config --global user.name<你GitHub的昵称>`
`git config --global user.Email<你的GitHub的邮箱>`
这是计算机记住在该文件夹进行操作的用户，可在状态查找中索引到。
#### **本地操作**
 1.`git clone 网址`       把远程仓库的文件置于本地  
 2. `mkdir file`          创建一个文件夹
 3. `cd  file`           将操作转移到某个文件夹中 
 4. ` cd../`               返回上一文件夹
 5. `pwd`                   显示当前文件的位置
 6. `git diff file`    查看具体修改的内容
 7. `vim file`      修改文件内容
 8. `cat file`     查看文件
 9. `git checkout -- file` 把文件在工作区的修改全部撤销（指**全部撤销**，**上一次**的修改添加）
 10.  `git reset HEAD file` 可以把暂存区的修改撤销掉，重新放回工作区
#### **本地仓库**
 1. `git init`               初始化本地版本库，令其适用于git后续操作
 2. `git add file` 跟踪指定文件，添加到暂存区内（包括拓展名）
 3. `git add .` 跟踪所有已修改的文件
 4. `git commit -m"file"`提交特定文件，储存在本地仓库中（提交后会清除暂存区里的内容）
 5. `git commit -m"message"`提交所有修改的文件
#### **SSH密钥**
#####创立SSH Key
 `sh-keygen -t rsa -C "youremail@example.com"`
    命令执行成功后，可以在用户主目录里找到.ssh目录，里面有id_rsa和id_rsa.pub两个文件，
   这两个就是SSH Key的秘钥对，id_rsa是私钥，不能泄露出去，id_rsa.pub是公钥
#####设置SSH Key
    登陆GitHub，打开“Account settings”，“SSH Keys”页面：
    然后，点“Add SSH Key”，填上任意Title，在Key文本框里粘贴id_rsa.pub文件的内容；
#### **远程操作**
4. `git remote add origin SSH网址` 将本地仓库和远程仓库连接
2. `git push`  推送文件，你的回车后，会自动要求你输入账号，密码(先将该仓库与远程仓库连接)
3.  `git push -u origin 分支名` 把本地仓库的文件提交到GitHub上的该分支上
4.  `git rm -r --cached file/` 删除某文件
5. `git rm -r --cached file/file `删除某文件下面的特定文件(远程仓库中)
#### **分支有关**
1. `git branch`查看本地分支（指目前所在分支，一般就是master） 
2. `git branch 分支名` 创建新的分支
3. ` git checkout 分支名` 切换到该分支
4. `git branch -d` 删除该分支
5. `git merge 分支名` 将指定分支合并到当前分支

git status 查看仓库的当前状态分别有以下状态：
1. Changes not staged for commit文件位于工作区域   2 Changes to be committed文件位于暂存区   3 nothing to commit, working tree clean没有什么需要提交的，说明文件位于本地仓库 
#### **版本历史**
1. `git log` 由近及远显示版本历史 
2. `git reset --hard HEAD^` 版本回退
用HEAD表示当前版本，则HEAD^表示上一个版本，HEAD^^表示上上一个个版本，用HEAD~100表示当前版本的上一百个版本。
也可直接指定版本号   `git reset --hard 版本号`
3. ` git reflog` 用于查看命令的历史，以便确定回到哪个版本 
4. `git status`查看当前工作区域及暂存区的状况
![1](http://images.cnitblog.com/i/10508/201404/222147507797491.png)

----------
##寄语
**排课满，任务多，时间少，想说点励志的，但真心说不出来。。。**
![2](http://img5.imgtn.bdimg.com/it/u=3954594669,1837216206&fm=26&gp=0.jpg)
**聊以自勉**

