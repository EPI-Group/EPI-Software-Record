#### Git简介

- 首先Git是一个开源的分布式版本控制系统，可以有效、高速的处理从很小到非常大的项目版本管理。所谓分布式相比于集中式的最大区别在于开发者可以提交到本地，每个开发者通过克隆，在本地机器上拷贝一个完整的Git仓库。简单来说，Git可以帮助我们在不用联网的情况下交换彼此的项目并去修改。总之，对任何一个互联网开发的从业者都是很方便的。

#### Git的安装

- 在Git官网去下载相应的版本然后一路默认安装即可。

- **注意**：安装完成后，打开Git bush在命令行输入：

  `$ git config --global user.name "Your Name"`

  `$ git config --global user.email "email@example.com"`

  *以管理员权限运行Git bush,并且输入姓名和邮箱不加双引号。*

#### 简单的Git操作

- GitHub配置ssh key
   在Git上输入`$ cd ~/.ssh`(查看本机是否有ssh key设置），如果则`$ ~/.ssh`（ls查看当前路径文件），如果没有则`$ ssh-keygen -t rsa -C "xxxxxx@yy.com"`(填写自己真实的邮箱信息)，然后三次回车，在本地磁盘的用户文件夹下找到.ssh文件并打开，之后找到id~rsa.pub打开复制公钥（**注意**：不可打开私钥）。登录GitHub官方账号，点击自己头像找到settings并打开SSH and GPG keys配置即可。
- Git建立本地仓库
   创建目录：`$ mkdir test`(新建test)，`$ cd test`(切换到test目录下)，`$ pwd`(显示当前目录)，
   `$ git init`(把这个目录变成git可以管理的仓库)。经过这样的几步就把仓库建好了，而且是一个空的仓库。

- 向仓库上传文件
   `$ git add <文件名>`（上传文件），`$ git add .`(上传所有的文件)，`$ git commit -m <message>`(把文件提交到仓库）。
- 修改文件
   `$ git status`命令可以让我们时刻掌握仓库当前的状态，当我们发现文件被修改过时，可以使用`$ git diff`命令查看修改内容。修改完成后提交上传即可。
- 删除文件
   `$ rm test.md`

- 建立分支
   通常我们需要在自己的仓库上去建立分支，这样方便我们去提交我们的代码或者是一些重要的笔记，更利于查找和管理。首先在Github克隆远程仓库的地址，打开Git输入`$ git clone "地址"`,`$ git branch first`(建立分支)，`$git checkout first`(切换到first分支)，以上的两条命令也可合成一条`$ git checkout -b first`(建立并切换到first分支)， `$ git branch`(查看当前分支状态)  ，经过这样的几步就可以在仓库下建立分支。之后就可以通过`$ git add .`去提交文件,经过`$ git commit -m "修改标记"`和`$ git push origin branch`就可以将文件提交到远程仓库GitHub上了 。

------

- *以上就是我经过这一周学习了一些简单的Git操作，但是并没有完全的去学完Git的操作，之后我会再去学习并且掌握。*		

