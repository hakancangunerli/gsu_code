;Student: Hakan Gunerli (John Gunerli)
; Class: CSC3210
; Assignment#: 2
; Description: This program evaluates the given expression at section1.



.386
.model flat, stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data 
VAL1 BYTE 12 
VAL2 BYTE 9
VAL3 BYTE 2
.code
main proc 

    MOV EAX, 0 ; clean to make it more readable. 
	MOV EBX, 0
	MOV ECX, 0
	MOV EDX, 0

	MOV CL, VAL3
	ADD CL, 7 

	MOV DL, VAL2 
	ADD DL, VAL1 

	SUB CL,DL

	ADD AL, CL 
	ADD AL, (5/3)*7

	

	invoke ExitProcess, 0
main endp
end main


