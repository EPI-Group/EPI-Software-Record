# 一、Git是什么？
* 是一个开源的分布式版本控制系统，可以有效、高速的处理从很小到非常 大的项目版本管理。 Git 是 Linus Torvalds 为了帮助管理 Linux 内核开发而开发的一个开放源码的版本控制软件。

# 二、Git的安装？
##### 1. 下载Git
[Git官网连接](https://git-scm.com/)
![Git官网主页面](https://upload-images.jianshu.io/upload_images/14263125-98a92c51cc0acb98.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)点击右下角Download完成下载
##### 2. 下载完成后，打开安装包选好安装的目录，直接一直点击 next> (其他都是默认值)，遇到Install直接进行安装。
##### 3. 验证Git的安装正确，按下win键+r  打开cmd(运行窗口)输入下列指令：
`git --version`
* 若安装正确会出现下面的图(1)，若不正确请重新安装。![图(1)](https://upload-images.jianshu.io/upload_images/14263125-ddba7da0594a60ae.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

# 三、Github账号注册--仓库创建
##### 1. 进入[Github官网](https://github.com/)，注册账号页面。![](https://upload-images.jianshu.io/upload_images/14263125-23a03c671b40e74a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* Username 创建你的Github账户名
* Email 填写你的邮箱
* Password 你的登陆密码

##### 2. 注册成功页面。![](https://upload-images.jianshu.io/upload_images/14263125-5eec38736b40d354.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 选择Free
* Continue 进行下一步![](https://upload-images.jianshu.io/upload_images/14263125-e0c2d492cee040cc.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)点击右上角+号 点击进入 New repository

##### 3. 创建仓库
* 出现邮箱验证![](https://upload-images.jianshu.io/upload_images/14263125-1b46afa6e4191ad0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)点击箭头处验证
* 进入New repository(创建新仓库)
![](https://upload-images.jianshu.io/upload_images/14263125-ae0835c8f897469e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)输入仓库名如：test(测试)
* 进入添加文件形成仓库![](https://upload-images.jianshu.io/upload_images/14263125-64448f5867a27953.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)点击*README*
使用[markdown语言](https://www.appinn.com/markdown/)进行书写
* 写完后点击地下的*commit new file*完成仓库创建

# 四、建立Git与Github的配置
* 鼠标右键桌面打开Git Bash Here输入以下代码完成配置![](https://upload-images.jianshu.io/upload_images/14263125-4d86b387fe25fec1.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 一个写注册名，一个写邮箱

# 五、Git大致工作流程
##### 1. 在硬盘中创建一个文件夹(git 仓库)，右键Git Bash Here，接下来创建的所有文件都将放入里面
##### 2. 下一步点击下图的红标处复制地址![](https://upload-images.jianshu.io/upload_images/14263125-46583760ace8afca.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 3. 右键打开(git 仓库)的Git Bash Here,粘贴地址，完成仓库的下载![](https://upload-images.jianshu.io/upload_images/14263125-bf0941ccc08a41d5.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)这就是远程仓库东西的储存到Git中
##### 4. 同样我们也可以在本地git 仓库中创建 c.txt 上传，先进入test文件夹中，然后由 *工作目录* 上传到 *暂存区* ![](https://upload-images.jianshu.io/upload_images/14263125-567485648abdf164.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 5. 然后执行git commt上传到 *本地仓库* ，进入添加c.txt的注释![](https://upload-images.jianshu.io/upload_images/14263125-33cfb891a1de57e8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 6. 做完这些只是提交到了本地仓库，如果想要提交到Github上的仓库，我们要执行git push，出现![](https://upload-images.jianshu.io/upload_images/14263125-73bce5c93578b981.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 7. 之后让你输入你的Github用户名，然后弹出一个让你输入密码的对话框输入密码，完成上传到 *远程仓库* ![](https://upload-images.jianshu.io/upload_images/14263125-b81b3cb4fb9c73d2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)然后你就在Github的仓库中看到你的上传和注释![](https://upload-images.jianshu.io/upload_images/14263125-4335f7a678720ef8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 同理我们也可以将在远程仓库中添加或修改，点击箭头指的Create new file，添加文件名d.txt然后编辑，点击最下边的绿色地方完成保存。接下来，添加到我们的本地仓库，执行输入git pull,完成添加
##### 总结图![](https://upload-images.jianshu.io/upload_images/14263125-407f9a01888d706b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

# 六、Git文件状态
##### 1.右键Git Bash Here,执行git init test,在git 仓库创建了test文件夹里面会有一个.git文件夹(如果没有点击此电脑功能区的查看，在文件的扩展名和隐藏的项目都打上对勾)
##### 2.然后cd test进入文件test中，执行touch init创建init文件![](https://upload-images.jianshu.io/upload_images/14263125-ffdc637148179767.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 3.根据第五部分的总结图我们知道git无非是 *工作目录-暂存区-本地仓库-远程仓库* 的储存、提取、编译。那麽他们的转换关系的执行步骤是什么呢？
* 上传文件init，如图![](https://upload-images.jianshu.io/upload_images/14263125-eb0903096e78e53f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 其中上传init文件时，可进行修改执行语句：vi init
进入修改面然后就是通过我上面说到的编辑命令
* 想要查看 *工作目录-暂存区-本地仓库* 文件通过vi init修改后的区别可通过此图![](https://upload-images.jianshu.io/upload_images/14263125-9518ab1da46de862.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
```
git diff --cached 查看本地仓库与暂存区储存的区别
git diff                查看暂存区与工作目录储存的区别
git diff HEAD     查看本地仓库与工作目录储存的区别
```

# 七、深入Git的储存
![](https://upload-images.jianshu.io/upload_images/14263125-744d63c453a4e968.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 1.同样在git 仓库创建test文件夹(步骤一样，同时显示.git文件)，继续创建一个echo文件名称a.txt包含内容123
>`echo "123">a.txt`
##### 2. 上传到暂存区
>`git add a.txt`
* 暂存区只存储了文件的名称和hash值
##### 3. 通过命令取去查看暂存区存储的内容
>`git ls-files -s`
* 得出的是hash内容我们通过执行
>`git cat-file -p (hash值如图)`
![](https://upload-images.jianshu.io/upload_images/14263125-6e67e4583c39ee98.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 图中hash值为190a(写前4为就可以)由查看暂存区得出
##### 4. 下来进行暂存区内容创建文件夹提交到本地仓库
>`git commit -m'创建文件夹a.txt'`
* 得到如图，注意只有数列(暂存区为name a.txt，对象库为commit 41cb tree c490 blob 190a 为我们所得，其它的是我们创建的另一个b.txt所作的对比显示 parent)![](https://upload-images.jianshu.io/upload_images/14263125-ab456422eb8b1bec.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 除了commit 对象，其它的commit都有一个或多个parent

# 八、Git分支
### 1> Git分支
##### 1. 如果我们想看当前test我们都有哪些提交？![](https://upload-images.jianshu.io/upload_images/14263125-f7fb293319cd13f9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 执行`git log`命令查看递交完整内容
* 我们如果只想看hash值则执行`git log --oneline`就可看到hash值
##### 2. 当前我们只有一个分支，那就是git帮我们创建的Master分支，通过执行`ll .git/refs/heads/`我们可以看到分支**master**![](https://upload-images.jianshu.io/upload_images/14263125-48193e8e46a8d9ad.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 下来通过执行`cat .git/refs/heads/master`来查看master的内容(指的是最新的提交)，可以发现是一个hash值(为最新提交的hash值)
* Git不允许空提交，但执行`git commit --allow-empty -m'空提交'`就可以空提交执行`git log --oneline`可以看到内容
* **master**指向的永远是最新的提交
##### 3. 创建新分支和运用
* 执行`git branch dev`这时我们就创建了一个dev分支
* 执行`git branch`查看我们的分支
>dev
>master
* 两个分支前面有✳号的代表我们在哪一个上面正进行工作
* 切换分支，执行`git checkout dev`切换到dev分支上
* 同时我们也有简单方法，执行`git checkout -b dev`直接创建并转到该分支下
* 我们也可以执行`git log --oneline --decorate`来查看会有哪些分支，和这些分支在哪个commit上
##### 总结小图![1](https://upload-images.jianshu.io/upload_images/14263125-b6f505418315db04.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![2](https://upload-images.jianshu.io/upload_images/14263125-6a1dd5893cdd953a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 4.递交后分支的改变
![](https://upload-images.jianshu.io/upload_images/14263125-f84fa3d7e2836140.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 通过图片我们可以看出递交了功能1和功能2，如果我们假定功能2有bug
* 我们需要在master上创建一个新分支进行操作我们可以执行`git branch bug_22 ad6a`分支后面是master指向commit的hash值ad6a
* 我们在通过`git checkout bug_22`跳转到bug_22分支上，也就是在master上进行操作
* 我们执行`git log --oneline`查看所有内容，你会发现只有空提交和两个创建文件的提交，其实这证明我们的这些都是在一个分支上面进行的，证明bug_22也在master上建成的
* 下来执行`git log --oneline --all`来查看全部内容，将会看到全部内容，执行`git long --oneline --all --decorate`可以看到分支名称![](https://upload-images.jianshu.io/upload_images/14263125-0ecd5db807a0f695.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 下来递交bug_22，执行`git commit --allow-empty -m‘修改bug_22'`，因为bug其实是我们假设的，这里递交的bug_22还是空提交![](https://upload-images.jianshu.io/upload_images/14263125-21ff653f523c995d.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 因为提交是有顺序的，所以让人会有感觉是dev功能2的副提交，下来执行`git log --oneline --all --decorate --graph`这里的意思使用图形法进行展示![](https://upload-images.jianshu.io/upload_images/14263125-ab92e2a5c57d9241.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)可以看出bug_22是由master进行提交，而dev开发的是功能1和功能2
* 这个就是bug修复好的提交但我们每次要查看有顺序提交图，要执行很多命令，所以git给我们了一个别名可以让我们，很快的得出
* 执行`git config alias.logg "log --oneline --all --decorate --graph"`这样我们下次只要执行`git logg`就可得出同样的图表展示
##### 总结图![](https://upload-images.jianshu.io/upload_images/14263125-14b4780d9983959a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240) 
* 图中执行`git checkout .`命令是，比如我们在工作目录对文件进行了修改但觉得改的不对，我们想要回到add .递交到暂存区的内容，我们执行此令就用暂存区的内容将工作目录覆盖，然后在上面操作
* 同样执行`git checkout HEAD .`是本地仓库和暂存区中的覆盖，看图

### 2> stash命令
##### 1. stash是把我们在工作区和暂存区做的修改，临时的放到一个地方，这个地方不是暂存区![](https://upload-images.jianshu.io/upload_images/14263125-043e501648d9e232.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 因为我们要切换到a所以得知git告诉我们你的b可能被替换，请你提交或者stash
* 我们执行`git status`查看我们的工作状态，得知做了修改但未提交
* 下来我们执行`git stash`，把我们在工作目录和暂存区做的修改存到一个地方，执行`git status`会发现我们的工作目录和暂存区和本地仓库内容一致，非常干净
* 同样我们执行`git stash list`来看我们存储的东西，它会添加一些注释![](https://upload-images.jianshu.io/upload_images/14263125-0c3f9f7fb0775c02.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 执行`git stash show -p stash@{0}`就可查看我们添加的东西
* 我们也可以执行`git stash pop`来将我们存到里面的东西拿出来![](https://upload-images.jianshu.io/upload_images/14263125-d3967fc22165d27e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)我们可以看出我们的b文件处于有了修改的内容但未提交，证明我们将内容拿了出来
* 执行`cat b`查看我们正在操作的目录，可以看出有我们的修改
* 这主要用于我们工作中的突发状况，出现a文件出现bug我们要去修改，但我们正在操作的b文件做了一半不足于提交(怕备注不清楚，容易搞混)，我们可以用stash作为中间桥梁
* 执行`git stash drop stash@{0}`可以用来删除这个stash

### 3> 分支合并
##### 1. 我们先转到master分支，执行`git checkout master`。执行`git merge b`将b分支合并到master上，这样我们前面所说master指向b分支，下来master就有了b分支上面所有的修改了。![](https://upload-images.jianshu.io/upload_images/14263125-8716963f9acfbe9a.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

>因为b分支在master上做过修改所以，所以合并时可以看到fast-forward提交
##### 2. 我们再将a分支也合并进去，用到的是三方合并。![](https://upload-images.jianshu.io/upload_images/14263125-13b0515d093428a3.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
指:
>1. 当前分支(提交)的内容
>2. 要合并的分支(提交)内容
>3.共同的一个祖先提交的内容
* 这也就介绍两种合并一种快速的，一种三方合并的

### 4> 分支合并之冲突解决
##### 1. 执行`git checkout master`转到master上修改文件init存储并提交![](https://upload-images.jianshu.io/upload_images/14263125-c3184fca278c6b52.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 2. 转到a上修改a的init文件同样提交![](https://upload-images.jianshu.io/upload_images/14263125-9599666ba7986c43.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 3. 转到master上合并这两个init![](https://upload-images.jianshu.io/upload_images/14263125-340a736a0f80f63b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 红线处说合并有冲突在init文件上，有了默指MERING不会帮我们提交
##### 4. 我们可以用Git自带的默指工具，执行`git mergetool`会给你推荐工具(不方便)我们点回车，下来退出编辑页面，问你y/n  回答n。我们自己配置方便的工具
##### 5. 在这里我们用到[idea](https://www.jetbrains.com/idea/)合并，下载并打开![](https://upload-images.jianshu.io/upload_images/14263125-916b65cf5a933836.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 下来把我们的地址D:\Git 仓库\ck(我自己的)写进去
* 打开之后我们创建一个file名称**.gitignore**![](https://upload-images.jianshu.io/upload_images/14263125-6c3be966660f8b42.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 6. 打开后，我们点击左下角version control 打开Git显示里面有一个unversioned files里面是Git不能管理的东西，所以我们要在.gitignore中写一些东西![](https://upload-images.jianshu.io/upload_images/14263125-838a068aeea3491f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 不打算让Git管理的文件，可以写到这里面
##### 7. ctrl+k开始提交commit massge进行添加说明(内容：添加gitignore)，下来我们可以在左下角log看到commit的数形结构，右下角中![](https://upload-images.jianshu.io/upload_images/14263125-42997fe66096c3ce.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)可以切换分支，现在我们就用master
* 下来我们开始合并分支![](https://upload-images.jianshu.io/upload_images/14263125-fd7cde3f6b0aa39f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 点击最终的merge changes，进去选上我们要合并的分支a，点merge，他会检测到冲突我们继续点击merge进入这个![](https://upload-images.jianshu.io/upload_images/14263125-1ed5d5a5d82b928c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 下来我们手动进行合并，点击111和222中间两个X号旁边的箭头，ctrl+z可以撤消，也就是放弃添加，添加完后点击右下方Apply
* 下来点击ctrl+k开始提交，添加合并说明，下来可以查看左边的init文件，可以看出里面已经合并
* 我们也可以用sourcetree查看![](https://upload-images.jianshu.io/upload_images/14263125-b535cad70bb78283.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)出现合并分支a，这就是合并两个冲突文件的合并

# 九、认识rebase
### 1> rebase
##### 1. 我们先依靠前面所学的知识，创建处在surcetree如图的分支结构![](https://upload-images.jianshu.io/upload_images/14263125-7deee92d725a9b80.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
```
git init rbs              //创建rbs文件仓库
cd rbs                   //切换到rbs仓库下
touch c0               //在master上执行创建c0
git add .                //放入暂存区
git commit -m'c0'        //提交c0
touch c1
git add .
git commit -m'c1'
git branch dev     //创建新分支dev
touch c2
git add .
git commit -m'c2'
touch c3
git add .
git commit -m'c3'
git checkout dev   //切换到dev上执行
touch c4
git add .
git commit -m'c4'
touch c5
git add .
git commit -m'c5'
git logg               //我们之前命名的logg，以图表形式展示
```
##### 2. 先切换到master分支上，rebase也就是变基操作，如![](https://upload-images.jianshu.io/upload_images/14263125-2eba6608b76261fe.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)我们本来c4和c5是由c1为基础创建提交的，但我们经过rebase，将c4和c5接到c3后面，这就是变基操作
* 下来我们进行操作，把c5和c4变基到c3，
* 执行`git rebase --onto master master dev`，进行变基，其中第一个master表示在master上变基到c3后面，第二个为master dev表示dev比master多出的文件，如c4和c5，所以总的操作为把dev多于master的c4和c5变基到c3后面，我们通过sourcetree进行对比![变基前](https://upload-images.jianshu.io/upload_images/14263125-7c80f2cc9796e5b9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![变基后](https://upload-images.jianshu.io/upload_images/14263125-6d4a9a212b390e57.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 其中发现c4和c5的hash值也发生了改变，因为commit的hash值跟父parent有关，既然变基操作改变了父parent，那么commit的hash值也改变了，但提交的修改内容未改变
* 下来我们发现master指向的是c3，dev指向的是c5'，我们要让master也指向c5'(通过rebase，c3和c5有了共同的提交线，master和dev在同一上面)，先切换到master上，执行`git merge dev`进行默指，因为在同一线上所以Git用Fast-forward的默指命令![](https://upload-images.jianshu.io/upload_images/14263125-bbc1bfd144077265.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
##### 总结图
##### 其中rebase是和merge做对比用的![采用idea默指方法进行提交](https://upload-images.jianshu.io/upload_images/14263125-cc67600e5fd33113.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![采用rebase方式进行提交](https://upload-images.jianshu.io/upload_images/14263125-3a39d59a9678e0c2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 对比两者rebase更干净，如果我们想让分支变得更简洁，就用rebase
* 当然如果我们的递交push到远程仓库了，那么我们最好不要用rebase

### 2> 交互式rebase
**建议先看之后的内容reset命令再回过来看这片内容**![](https://upload-images.jianshu.io/upload_images/14263125-978c3a37d422fba9.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)所以用rebase经过第四部还会保留原来的c0 c1 c2 c3
##### 1. 交互式rebase
* 首先我们创建一个交互式环境，如图![1](https://upload-images.jianshu.io/upload_images/14263125-f4b2ddcea93e8b54.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)切换到dev分支上
* 下来执行`git rebase -i --onto  master master dev`来进行交互式pick提交，接上去![2](https://upload-images.jianshu.io/upload_images/14263125-621957ccff197fce.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 其中还分为很多种类，下来我们执行`git reset -- hard 3ef5`将它还原到上一提交，也就是图1
* 下来我们去看看其他种类，执行`git rebase -i --onto  master master dev`，进入这个![3](https://upload-images.jianshu.io/upload_images/14263125-1e002100dd248dc6.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)我们上次是直接保存退出(shift+zz)
* hash值旁边是命令的选项，下来我们介绍这些命令
>p;pick=应用这个提交
>r;reword=修改提交的说明
>e;edit=可以修改提交，可以把提交拆分成好几个，在进行rebase
>s;squash=合并提交，比如我们可以把d1和d2合并到d0再提交
>f;fixup=在同条件与squash一样，但fixup会丢弃d1的说明，squash会保留
>x;exec=执行一个命令用来测试编译或运行的成功
>d;drop=可以去掉某个提交，比如把d0前面的pick改为d，则b0将不会rebase到m2后边
* 这次我们把d1前面的pick改为r，修改d1的说明，改为b111![4](https://upload-images.jianshu.io/upload_images/14263125-ac67b4b2fd5c9741.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)我们可以发现图4和图2中b1的说明修改过了
**下来我们接着用这些命令，操作一样执行`git reset -- hard 3ef5`将它还原，再执行`git rebase -i --onto  master master dev`选取其他命令**
* 我们选用e，修改d1添加一个文件b1-0将他们整体合并rebase到m2后![5
](https://upload-images.jianshu.io/upload_images/14263125-54d3e3a02a9cd497.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
![6](https://upload-images.jianshu.io/upload_images/14263125-c8ea3fd747177c21.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)其中主要是`git commit --amend`提交一个新的文件进去
* 继续我们的命令使用，先完成上述还原操作，和命令选择操作，我们使用命令s，将d1和d2前面的改为s，出现![7](https://upload-images.jianshu.io/upload_images/14263125-fdec91fa50fac448.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)我们保存退出
![8](https://upload-images.jianshu.io/upload_images/14263125-db2a75e61c377429.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)其中d0里面包含d1和d2，可根据`git log`查看
* 下来还原，并进入命令选择，将d1前面改为d，去掉d1文件![9](https://upload-images.jianshu.io/upload_images/14263125-54abe6f709f13362.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
**这就是交互式的rebase让我们有更多的命令去选，完成一些强大的功能，但push上去的commit最好别用rebase，会让提交更乱**
### 3> cherry-pick
* `cherry-pick`命令是把某个提交所对应的修改应用到我们当前的分支上
* 比如我们用交互式rebase环境进行也就是图1，我们先切换到master分支上，然后执行`ll`查看里面只有m0 m1 m2文件，我们想要d1应用到我们的master分支上，执行`git cherry-pick 369d`就可以了![10](https://upload-images.jianshu.io/upload_images/14263125-6d8275c79ba8f560.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 因此我们想用哪个提交的修改，cherry-pick可以直接帮助我们应用过来

# 十、远程分支
### 1> 远程分支
##### 1.先打开[Github](https://github.com)创建一个新仓库git-test和加入一个README文件，克隆地址
* 打开git将远程仓库的东西克隆下来，执行`git clone 复制的地址`
* 执行`cd git-test`进入git-test里面，同时再用sourcetree将git-test打开![](https://upload-images.jianshu.io/upload_images/14263125-ad22b19f6abea2cb.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)有master在上面执行和两个远程分支origin/master和origin/HEAD
* 执行`git branch -a`既能查看本地分支也能查看远程分支，其中origin代表了我们的哪个远程仓库
##### 2. 我们在Github中创建一个问件c0，提交备注为c0
* 执行`git fetch`进行远程下载，在执行`git merge origin/master`得到![](https://upload-images.jianshu.io/upload_images/14263125-a227740f98b4307c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)完成了不同的master都指向同一个
* 我们再在远程仓库建一个c1文件，这次我们执行`git pull`一开始我们提到过，你会发现它代替了git fetch和git merge origin/master两个命令![](https://upload-images.jianshu.io/upload_images/14263125-d790d83f9f5df6db.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)使不同的master也指向了同一个

### 2>跟踪分支
##### 1. 跟踪分支是在本地分支和远程分支建立了一种关系，git pull就是完成远程更新和跟踪远程的master分支将它merge到本地master分支上，同样git push也是使用跟踪提交到远程仓库
* 执行`git branch -vv`就可以查看到master的跟踪分支，就是origin/master
##### 2. 在GitHub中创建一个dev分支，执行`git fetch`更新到本地
* 再执行`git checkout dev`转到dev分支![](https://upload-images.jianshu.io/upload_images/14263125-0c796a3bb54e8861.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)注意这里我们本地是没有dev分支的所以这里的`git checkout dev`命令是基于远程的dev分支建立本地的dev并转到dev中,并将远程的dev分支设置为本地dev分支的跟踪分支![](https://upload-images.jianshu.io/upload_images/14263125-07ee2d537bf606ad.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 如果我们在dev上做修改，push时他就会提交到远程的dev上，同理master也一样

# 十一、Git的reset命令和revert命令
### 1> reset命令
> 执行`git reset chash --[.|filename]`是重置我们的暂存区，吧commit内容覆盖过去
> 执行`git reset --soft chash`，更新commit的hash值，不会更新暂存区和工作区的
>执行`git reset --mixed chash`，把commit覆盖到暂存区，但不会更改工作目录
> 执行`git reset --hard chash`，重置commit，重置暂存区和工作区
##### 1. 我们创建一个rst仓库，创建一个c0文件，暂存然后提交，再创建一个c1文件，暂存。执行`git ls-files -s`来查看现在暂存区的内容![](https://upload-images.jianshu.io/upload_images/14263125-ac97fb95ec7b18aa.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)现在暂存区有c1和c0两个暂存文件
* 执行`git ls-tree master`，来查看commit里面，有一个c0文件
* 执行`ll`，查看工作目录里面有c0和c1两个文件
* 执行`git status`来查看状态，c1没提交
* 执行`git reset master`或`git reset -- .`，再执行`git status`来查看状态，c1变为未跟踪的文件，他是把commit覆盖到了暂存区，所以c1就没有了，可以通过查看暂存区，发现只有c0，别commit覆盖了
* 我们可以得出git reset是git add . 的反向操作![](https://upload-images.jianshu.io/upload_images/14263125-799585cf437a705e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

##### 2. 下来我们再工作目录下将c1文件暂存并提交，执行`git log --oneline --all --decorate --graph`，来看提交树
* 比如我们发现提交c1是提交说明写错了不行该写c1行该写新提交文件c1
* 我们让master指向之前提交的c0的commit，再进行提交去修改提交内容
* 所以执行`git reset --soft master^`或`git reset --soft 上一个提交的hash值(c0的)`，下来我们看一下状态，发现c1处于暂存区等待提交，然后进行提交
* 当让Git也给我们提供一个简单的修改*最近提交*方式，执行`git commit --amend -m'c1'`，于是我们将提交说明新提交文件c1又改为c1![](https://upload-images.jianshu.io/upload_images/14263125-f39518b27ca39b12.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

##### 3. 下来看下一个命令把commit的内容覆盖暂存区，但不会更改工作区的命令
* 执行`git reset --mixed master^`，把master的上一个提交的c0覆盖过去，然后我们再查看状态发现c1变为未跟踪的，如果我们看工作目录里面的内容`ll`我们发现c1继续存在
* 下来我们再将c1提交

##### 4.下来说`git reset --hard master^`，你会发现状态是干净的，工作目录，暂存区，以及commit都保持一致
* 一切回归上一个c0，c1文件删除
### 2> revert命令
##### 1. 我们继续使用交互式rebase的文件环境，图1，切换到dev分支下，比如我们不想提交d2，执行`git revert 3ef5`得![](https://upload-images.jianshu.io/upload_images/14263125-340dde921539a1e8.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* revert“d2”是撤销的
* 我们发现d0有问题，我们执行revert，我们发现d0撤销了
##### 2. 下来我们回到最初，图1，执行把dev默指到master上![](https://upload-images.jianshu.io/upload_images/14263125-7d594269e21470af.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![](https://upload-images.jianshu.io/upload_images/14263125-8a8261184301be45.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
如果我们发现合过来的代码有问题
* 如果我们执行revert会发现报错
* 我们执行`git show b362`，发现指向两个merge一个m2一个d2，如果我们要回到dev进行的merge，则执行`git revert -m 2 b362`，就可以了![](https://upload-images.jianshu.io/upload_images/14263125-3763ae2e98b4b79c.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)![](https://upload-images.jianshu.io/upload_images/14263125-810a1dd596172bfd.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)
* 其实这里面可以用reset进行修改，但我们说了如果push了，那么revert将会更好，因此在一些已经push，我们更多用的式revert
**学到这里我们Git已经，可以进行一些东西的操作了**
**介绍两本学习Git的书，[Pro Git](https://git-scm.com/book/zh/v2) 和 [Git权威指南](https://github.com/gotgit/gotgit) **
