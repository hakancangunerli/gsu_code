.386
.model flat, stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data 
COUNT BYTE 100
WVAL WORD 2 
WVAL2 WORD 2 

.code
main proc
 MOV BL, COUNT
 MOV AX, WVAL
 MOV COUNT,AL 
 MOV CX, WVAL

 MOZVX AX, COUNT 
 MOVZX EAX, COUNT 

 MOV EDX, WVAL2
 MOV WVAL2, CX
 MOV WVAL,CX 
 
 INVOKE ExitProcess,0 
 main ENDP 
 END main