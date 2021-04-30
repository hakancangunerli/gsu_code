; hakan gunerli
; csc3210
; assignment 4 q1 
; this program attempts to short-circuit evaluate the given arguments, with the result sum =7 

.386
.model flat, stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data 
SUM WORD 0 
X SWORD 15 
A SWORD 9 
B SWORD 8

.code
main proc
MOV CX, 3 

ADD A,3
MOV AX,A
SUB A,3 

SUB B,3 
MOV BX,B 
ADD B,3

.WHILE X>=0

.IF (X != CX) && (X <= AX)  || (X< BX)
	
	SUB X,2 
	ADD SUM,1  
.ELSE 
	SUB X,1 
.ENDIF 
.ENDW
	invoke ExitProcess, 0

main endp
end main