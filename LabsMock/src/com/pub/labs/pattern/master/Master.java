package com.pub.labs.pattern.master;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * <p>Master-Worker常用的并行模,有两类进程协作完成</p>
 * @author：Gaoshi
 * @remark：Master负责接收和分配任务
 */
public class Master {

	protected Queue<Object> workQueue=new ConcurrentLinkedQueue<Object>();
}
