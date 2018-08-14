//PROG2
/*
	Arquivo: Rafael_Ramos_Silva_PROG2.c
	Autor: Rafael Ramos Silva
	Data: 14/08/18 11:27
	Descrição: Gera número aleatórios na faixa de [100,1000] e guarda na array
*/

#include <stdio.h>
#include <stdlib.h>
#define Max 49

//interface
	
void mostrarArray(int, int , int V[]);

main() {
	int i;
	int soma[Max];
	
	srand(time(NULL));
	
		for(i=0;i <= Max; i++){
			
			soma[i] = 100 + rand()%900;
			
		}
		
	mostrarArray (0, Max, soma);
	
	system("pause");
	
}

//implementação

void mostrarArray (int p,int q, int V[]){
	int k;
	for(k=p; k<=q;k++) printf(" %d-%d ", k,V[k]);
		printf("\n\n");
	}
