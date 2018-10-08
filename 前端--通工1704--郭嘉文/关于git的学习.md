## 前言
   这是我第一次写博客，而且是第一篇有关于技术的博客。自己学习编程，接触计算机的时间也不长，但是很喜欢，所以也一直在努力（群里大佬太多了，不努力不行呀）。所以写的不好或者说不清楚的地方就请忽略吧。

## 正题
GIT的安装和下载我就不在这儿多废话了，百度上有一大堆，随便找找就能装了，我就直接说说我对GIT的见解好了。（中间用的图基本都是从网上盗的，没有别的意思，我只是觉得这些图很有助于对于知识的理解，请见谅，也谢谢理解）

#### GIT的工作流程
我觉得在学习如何敲代码之前，应该了解一下GIT的工作流程，毕竟它是一个版本控制系统，既然起到控制的作用，那么我们应该知道它的工作原理，这样也有助于后面对于代码的理解。

我在网上有找到图片进行说明：
![git-process.png](https://upload-images.jianshu.io/upload_images/14266435-14eeee03d6fedd3e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

图上的步骤很复杂，我说说我自己的理解：
* 首先，克隆出来别人的资源（用GIT进行代码命令，这个后面会说，现在先看懂就行）
* 你抄了比如人的东西肯定不能全用呀，所以要进行修改和添加
* 人家的代码更新了，我们也要与时俱进呀，所以也可以更新克隆来的代码
* 改完了准备提交，提交前要查看一下自己的修改
* 提交
* 在修改完成后，如果发现错误，可以撤回提交并再次修改并提交。
以上就是我在学习过后自己总结的工作流程。

#### Git 工作区、暂存区和版本库
GIT的工作是分阶段进行的，网上的教程和博客有些写的很晦涩难懂，比较复杂，所以我先说说自己的理解，然后再上更加专业的定义。
我觉得这个过程其实比较有利于维护和管理，更能体现GIT的“控制”功能。当我们想要提交一些东西的时候，用GIT我们需要先建立一个仓库（git init）,也可以手动建立（新建一个文件夹，然后右键鼠标点击“GIT BUSH HERE”）。然后就要添加文件了（git add），这样做之后就会将你的文件添加到暂存区，相当于文件是商品，暂存区则是发货前的商品存放仓库，方便文件的修改、确定和最终的提交。再确认好了文件的修改后，就可以提交了（git commit）,这就会将暂存区里的东西都写到版本区里。
这些就是我对他们的基本理解，其中还有很多细节上的修改和操作，如"git reset HEAD" 时，暂存区的目录树被版本区的目录树替代；"git rm --cached <file>" 删除暂存区的文件; "git checkout ." 或者 "git checkout -- <file>" 用暂存区的文件替代工作区的文件； "git checkout HEAD ." 或者 "git checkout HEAD <file>" 等的操作还很多，我自己还没有理解的太深入，因此也就不在这里做说明了，下面就直接上图和定义了。

* **工作区：** 就是你在电脑里能看到的目录。
* **暂存区：** 英文叫stage, 或index。一般存放在 ".git目录下" 下的index文件（.git/index）中，所以我们把暂存区有时也叫作索引（index）。
* **版本库：** 工作区有一个隐藏目录.git，这个不算工作区，而是Git的版本库。

![image](http://upload-images.jianshu.io/upload_images/14266435-4e51d822b00de19a.jpg?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)


#### Git 基本操作
因为GIT的操作命令比较多，这里就列举出来几个比较典型而且常用的命令，其余的命令在需要使用的时候可以上网查找。
###### git init
这个命令我们上面有提到过，是创建库的售后使用的，在任何的目录下都可以使用。输入：
> git init

就可以创建一个GIT库了。

###### git clone
用git clone可以将GIT库拷贝到本地，然后自己进行修改和查看。输入：
> git clone[url]

[url]为你想要复制的项目（可以是网址），就可以克隆了。
例如：
> $ git clone http://github.com/jquery/jquery.git


###### git add
这个在前面也有提到过，可以将文件添加到缓存。
> git add

add后面可以加文件名，也可以加 “.” 代表添加所有文件。

###### git status
它可以查看你的你的修改，可以和 “git add” 配合使用，同时在status后面添加 “-s”可以查看简短的信息，否则输出详细信息。
如：
> $ git status -s
> A  README
> A  hello.php

> $ git status
> On branch master
>
> Initial commit
>
> Changes to be committed:
> (use "git rm --cached <file>..." to unstage)
> new file:   README
    new file:   hello.php


###### git diff
这个用来查看写入缓存前后的区别，可以分为以下几类：
* 尚未缓存的改动：git diff
* 查看已缓存的改动： git diff --cached
* 查看已缓存的与未缓存的所有改动：git diff HEAD
* 显示摘要而非整个 diff：git diff --stat
在first.php下输入内容为：
> <?php
echo 'hello';
?>

>  $ git status -s
>
> A  README
AM hello.php
$ git diff
diff --git a/hello.php b/hello.php
index e69de29..69b5711 100644
--- a/hello.php
+++ b/hello.php
@@ -0,0 +1,3 @@
+<?php
+echo 'hello';
+?>

###### git commit
这个命令我们前面也提到过，他可以将暂存区的文件提交到版本库中去。在进行要求配置用户名和邮箱。
>  $ git config --global user.name 'github'
>
>  $ git config --global user.email git@qq.com

如图为上传成功的代码：
![捕获.PNG](https://upload-images.jianshu.io/upload_images/14266435-37f87aed86555fb0.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

“first commit”为第一次提交

###### git reset HEAD
用于取消已缓存的内容。
> $ git status -s
> M README
> M hello.php
>
> $ git add .
>
> $ git status -s
>
> M  README
> M  hello.pp
> $ git reset HEAD hello.php 
>
> Unstaged changes after reset:
> M    hello.php
> $ git status -s
> M  README
> M hello.php

#### Git 分支管理
意味着从主线分开一个支路，同时工作。
创建分支：
> git branch (branchname)

切换分支：
> git checkout (branchname)

合并分支，将多个分支合并在一起：
> git merge 

###### 列出分支
列出分支的命令：
> git branch

没有参数时，会列出本地分支：
![2.PNG](https://upload-images.jianshu.io/upload_images/14266435-37ba436ea0715628.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

手动创建分支后如下：
![3.PNG](https://upload-images.jianshu.io/upload_images/14266435-6b00e80272ddb184.PNG?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

###### 切换分支

> $ ls
>
> README
> $ echo 'test' > test.txt
>
> $ git add .
> 
> $ git commit -m 'add test.txt'
>
> [master 048598f] add test.txt
>  2 files changed, 1 insertion(+), 3 deletions(-)
> delete mode 100644 hello.php
> create mode 100644 test.txt
> $ ls
>
> README        test.txt
>
> $ git checkout first
>
> Switched to branch 'first'
> $ ls
> README        hello.php

当我们切换到"first"分支的时候，我们添加的新文件test.txt被移除了, 原来被删除的文件hello.php文件又出现了。切换回"master"分支的时候，它们有重新出现了。

> $ git checkout master
>
> Switched to branch 'master'
> $ ls
> README        test.txt

###### 删除分支
删除分支命令为：
> git branch -d (branchname)

删除first分支：
> $ git branch
>  \*  master
>    first
>
> $ git branch -d first
>
> Deleted branch first (was 85fc7e7).
> $ git branch
>
>   \*   master


###### 分支合并

>  $ git branch
> 
>  \* master
>   newtest
> $ ls
> README        test.txt    test2.txt
> 
> $ git merge newtest
> 
> Updating 2e082b7..556f0a0
> Fast-forward
 > test2.txt | 1 -
 > 1 file changed, 1 deletion(-)
>  delete mode 100644 test2.txt
> $ ls
> README        test.txt

以上将newtest合并到主分支上去，test2.txt被删除。

###### 合并冲突
首先，我们创建一个叫做"change_site"的分支，切换过去，我们将内容改为 hello。
> $ git checkout -b change_site
> 
> Switched to a new branch 'change_site'
> $ vim test.txt 
> 
> $ head -1 test.txt 
> 
>hello
> $ git commit -am 'changed the site'
> [change_site d7e7346] changed the site
> 1 file changed, 1 insertion(+), 1 deletion(-)

将修改的内容提交到 "change_site" 分支中。 现在，假如切换回 "master" 分支我们可以看内容恢复到我们修改前的，我们再次修改test.txt文件。

> $ git checkout master
>
> Switched to branch 'master'
> $ head -1 test.txt 
> 
> hi hello
> $ vim test.txt 
> 
> $ cat test.txt
> 
> runoob.com
> 新增加一行
> $ git diff
> 
> diff --git a/test.txt b/test.txt
> 
> index 704cce7..f84c2a4 100644
> --- a/test.txt
> +++ b/test.txt
> @@ -1 +1,2 @@
> hi hello
> +新增加一行
> $ git commit -am '新增加一行'
> [master 14b4dca] 新增加一行
 > 1 file changed, 1 insertion(+)

现在这些改变已经记录到我的 "master" 分支了。接下来我们将 "change_site" 分支合并过来。

> $ git merge change_site
> 
> Auto-merging test.txt
> CONFLICT (content): Merge conflict in test.txt
> Automatic merge failed; fix conflicts and then commit the result.
> $ cat test.txt 
> <<<<<<< HEAD
> hi hello
> 新增加一行
> =======
> hello
> \>>>>>>> change_site

我们将前一个分支合并到 "master" 分支，一个合并冲突就出现了，接下来我们需要手动去修改它。

> $ vim test.txt 
> 
> $ cat test.txt 
> 
> hello
> 新增加一行
> $ git diff
> diff --cc test.txt
> index f84c2a4,bccb7c2..0000000
> --- a/test.txt
> +++ b/test.txt
> @@@ -1,2 -1,1 +1,2 @@@
> - hi hello
> + hello
 > +新增加一行

在 Git 中，我们可以用 git add 要告诉 Git 文件冲突已经解决

> $ git status -s
> 
> UU test.txt
> $ git add test.txt 
> 
> $ git status -s
> 
> M  test.txt
> $ git commit
> [master 88afe0e] Merge branch 'change_site'

现在我们成功解决了合并中的冲突，并提交了结果。
