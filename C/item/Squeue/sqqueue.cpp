#include <stdio.h>
#include <malloc.h>
#define MaxSize 100
typedef char ElemType;
typedef struct {
	ElemType data[MaxSize];
	int front, rear;
}SqQueue;

void InitQueue(SqQueue*& q) {
	q = (SqQueue*)malloc(sizeof(SqQueue));
	q->front = q->rear = 0;
}

void DestroyQueue(SqQueue*& q) {
	free(q);
}

bool QueueEmpty(SqQueue* q) {
	return (q->front == q->rear);
}

bool enQueue(SqQueue*& q, ElemType e) {
	if ((q->rear + 1) % MaxSize == q->front)
		return false;
	q->rear = (q->rear + 1) % MaxSize;
	q->data[q->rear]=e;
	return true;
}

bool deQueue(SqQueue*& q, ElemType& e) {
	if (q->front == q->rear)
		return false;
	q->front = (q->front + 1) % MaxSize;
	e = q->data[q->front];
	return true;
}

int main() {
	ElemType e;
	SqQueue* q;
	printf("环形队列基本运算如下：\n");
	printf("(1)初始化队列q\n");
	InitQueue(q);
	printf("(2)依次进队列元素a,b,c\n");
	if(!enQueue(q,'a'))printf("\t提示：队满，不能进队\n");
	if (!enQueue(q, 'b'))printf("\t提示：队满，不能进队\n");
	if (!enQueue(q, 'c'))printf("\t提示：队满，不能进队\n");
	printf("(3)队列为%s\n",(QueueEmpty(q)?"空":"非空"));
	if (deQueue(q, e) == 0)
		printf("队空，不能出队\n");
	else
		printf("(4)出队一个元素%c\n",e);
	printf("(5)依次进队元素d,e,f\n");
	if (!enQueue(q, 'e'))printf("\t提示：队满，不能进队\n");
	if (!enQueue(q, 'd'))printf("\t提示：队满，不能进队\n");
	if (!enQueue(q, 'f'))printf("\t提示：队满，不能进队\n");
	printf("(6)出队列序列：");
	while (!QueueEmpty(q)) {
		deQueue(q,e);
		printf("%c", e);
	}
	printf("\n");
	printf("(7)释放队列\n");
		DestroyQueue(q);
		return 1;
}
