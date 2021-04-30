.386
.model flat, stdcall
.stack 4096
ExitProcess proto,dwExitCode:dword

.data 
xval SDWORD 26
yval DWORD 30
zval DWORD 40

.code
main proc
 mov eax, xval
 mov ecx, yval
 mov edx, zval
 add ecx, edx
 sub eax, ecx 
 
 invoke ExitProcess,0 
 main endp 
 end main 