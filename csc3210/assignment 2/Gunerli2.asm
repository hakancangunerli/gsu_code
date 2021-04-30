;Student: Hakan Gunerli (John Gunerli)
; Class: CSC3210
; Assignment#: 2
; Description: This program evaluates the given expression at section2.



.386
.model flat, stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data 
VAL1 BYTE 12 
VAL2 BYTE 9
VAL3 BYTE 2
.code
second proc ; 8 BIT REGISTERS ONLY CAN. 
	mov eax, 0 
	mov ebx,0 
	mov ecx, 0
	mov edx, 0

	MOVZX CX, VAL1
	MOVZX BX, VAL2
	MOVZX DX, VAL3
	
	NEG BX
	NEG DX 

	ADD BX, 7 
	ADD DX,CX 
	SUB BX,DX 




	invoke ExitProcess, 0
second endp
end second

