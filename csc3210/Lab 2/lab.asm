; AddTwo.asm - adds two 32-bit integers. 
.386
.model flat,stdcall 
.stack 4096
ExitProcess PROTO,dwExitCode:DWORD 
.code
lab PROC 
	mov eax,5
	add eax,7
INVOKE ExitProcess,0
lab ENDP
END lab