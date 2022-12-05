<h1>Stack</h1>
<p>Abstract datatype that is a list of elements organized by a LIFO recipe.</p>
<img src="https://avatars.mds.yandex.net/i?id=ee84b286c91b7048d7fadd8f6ae76678-5286894-images-thumbs&n=13&exp=1">

<h2>Description</h2>
<p>
The stack is the memory set aside as scratch space for a thread of execution. When a function is called, a block is reserved on the top of the stack for local variables and some bookkeeping data. When that function returns, the block becomes unused and can be used the next time a function is called. The stack is always reserved in a LIFO (last in first out) order; the most recently reserved block is always the next block to be freed. This makes it really simple to keep track of the stack; freeing a block from the stack is nothing more than adjusting one pointer.
<br>
From StackOverFlow
</p>

<h2>Input stack</h2>
<code>
5<br>
4<br>
3<br>
2<br>
1<br>
</code>

<h2>Using</h2>
<code>
stack.peek();<br>
stack.push(6);<br>
stack.peek();<br>
</code>

<h2>Output</h2>
<code>
5 - before push<br>
6 - after push<br>
</code>

<h2>Stack in memory</h2>
<img src="https://operatingsystemclass.files.wordpress.com/2011/06/9-7.png">