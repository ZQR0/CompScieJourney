<center><h1>Heap</h1></center>
<img src="https://miro.medium.com/max/1200/0*pJeBOsic4VCc6FIe.png">

<h2>Description</h2>
<p>The heap is memory set aside for dynamic allocation. Unlike the stack, there's no enforced pattern to the allocation and deallocation of blocks from the heap; you can allocate a block at any time and free it at any time. This makes it much more complex to keep track of which parts of the heap are allocated or free at any given time; there are many custom heap allocators available to tune heap performance for different usage patterns.
<br>
<br>
A Heap is a specialized tree-based data structure. Therefore it's composed of nodes. We assign the elements to nodes: every node contains exactly one element.
</p>

<h2>Binary Tree</h2>
<code>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;        1<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      /    \ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   2      3<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   /  \    <br>
&nbsp;&nbsp;&nbsp;&nbsp;  4 &nbsp;   5 <br>
</code>

<h2>Heap variants</h2>
<h4>Min Heap</h4>
<p>From smaller to bigger</p>
<code>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      1 <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   /    \ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   2      3 <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  /  \    /  \ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;4  5  6  7
</code>

<h4>Max Heap</h4>
<p>From bigger to smaller</p>
<br>
<code>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;      10 <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   /    \ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   8      7 <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  /  \    /  \ <br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;6  5  4  3
</code>

<h2>Heap in memory (for Java)</h2>
<img src="https://jackyfkc.github.io/cs/language/java/images/jvm.png">
