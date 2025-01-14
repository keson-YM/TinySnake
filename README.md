# Tiny Snake

一个 PyCharm 小插件，用于提升自己的 Python 开发体验。

## 安装

目前需要手动编译安装。

1. 克隆这个项目并使用 IDEA 打开；
2. 在右上方的运行配置或右侧的 Gradle 里找到 `Build Plugin` 并运行，得到编译后的插件；
3. 在 PyCharm 的插件中选择 **从磁盘中导入** ，它默认放在 `./build/distributions` 里面。

![](./.img/installation.png)

## 更新

1. `git fetch` 、 `git pull` 这个项目，或者作出自己需要的修改；
2. 通过 `Build Plugin` 重新编译；
3. 在 PyCharm 的插件中 **卸载** Tiny Snake，然后关掉设置窗口；
4. 重新打开 PyCharm 中的插件面板，选择 **从磁盘中导入** 。不必重启整个 PyCharm。

## 功能

### 生成 `__all__`

按照符号声明顺序列出所有一般来说可以导出的符号，包括但不限于

1. 顶层作用域中所有不以下划线开头的变量、函数和类
2. 顶层作用域中 `if` 语句体内的 (1.)

以下符号绝对不会展示

- 特殊变量，例如 `__author__`
- 私有符号，例如 `_var` 、 `_func()` 、 `_InnerClass`
- 循环解包的变量，例如 `for i in range(10)` 中的 `i`
- 导入的符号

灰色的是已经在 `__all__` 中的符号，可以重复选择，但不会被加进去。

可以在 菜单栏->代码->生成 中找到，也可以在编辑器的右键菜单中找到。

![生成DunderAll的示意图](./.img/generate-dunder-all.png)

### 生成 Shebang 行

> Shebang 是以 `#!` 开头的单行备注，只能放在文件第一行，用于标明当前文件需要哪个解释器来解释/执行。

> Windows 下使用 py.exe 运行脚本即可解析 Shebang 。

预置了几种常见于 Python 脚本的 Shebang，还可以选择基于项目的路径、绝对路径以及自定义文本（方便粘贴）等。

可以在 菜单栏->代码->生成 中找到，也可以在编辑器的右键菜单中找到。

写 Python 脚本的同时还记不住 Shebang 的时候挺重要的，其它情况下聊胜于无。

没有考虑自定义预置项目，毕竟这插件就是面向 PyCharm 的，加上常用的 Shebang 也就那么几条。

![生成Shebang的示意图](./.img/generate-shebang.png)

### 优化 `__all__`

提供了对 `__all__` 值的优化，包括排序、换行方式以及字符串风格。默认快捷键是 `Ctrl+Alt+D` 。

在 菜单栏 -> 代码 中可以找到。

![优化DunderAll的示意图](./.img/optimize-dunder-all.png)

## 反馈

- 请对 bug 重拳出击，我会积极解决。
- 新需求可能没那么快处理，也可能不能处理，因为俺的 Java 是现学现用的。
