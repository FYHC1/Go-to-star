#include <stdio.h>
#include <malloc.h>
#define MaxSize 100
typedef char ElemType;
typedef struct
{
	ElemType data[MaxSize];
	int top;
}SqStack;

void  InitStack(SqStack*& s) {
	s = (SqStack*)malloc(sizeof(SqStack));
	s->top = -1;
}

void DestoryStack(SqStack*& s) {
	free(s);
}

bool StackEmpty(SqStack* s) {
	return s->top == -1;
}

bool Push(SqStack*& s, ElemType e) {
	if (s->top == MaxSize - 1)
		return false;
	s->top++;
	s->data[s->top] = e;
	return true;
 }

bool Pop(SqStack*& s, ElemType& e) {
	if (s->top == - 1)
		return false;
	e = s->data[s->top];
	s->top--;
	return true;
}

bool GetTop(SqStack* s, ElemType& e) {
	if (s->top == -1)
		return false;
	e = s->data[s->top];
	return true;
}

int main() {
	ElemType e;
	SqStack* s;
	printf("˳��ջs�Ļ����������£�\n");
	printf("(1)��ʼ��ջs\n");
	InitStack(s);
	printf("(2)ջΪ%s\n", (StackEmpty(s) ? "��" : "�ǿ�"));
	printf("(3)���ν�ջԪ��a,b,c,d,e\n");
	Push(s, 'a');
	Push(s, 'b');
	Push(s, 'c');
	Push(s, 'd');
	Push(s, 'e');
	printf("(4)ջΪ%s\n", (StackEmpty(s) ? ("��") : ("�ǿ�")));
	printf("(5)��ջ˳��");
	while (!StackEmpty(s))
	{
		Pop(s, e);
		printf("%c", e);

	}
	printf("\n");
	printf("(6)ջΪ%s\n", (StackEmpty(s) ? ("��") : ("�ǿ�")));
	printf("(7)�ͷ�ջ\n");
	DestoryStack(s);
		return 1;
}