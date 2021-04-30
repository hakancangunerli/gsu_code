.386
.model flat,stdcall 
.stack 4096
ExitProcess PROTO,dwExitCode:DWORD 



.data
temp dword ?

.code
;description
name PROC
mov eax,0
mov ecx,10 		; outer loop counter
L1:
      mov eax,3
      mov temp,ecx 
      mov ecx,5 		; inner loop counter
L2:
      add eax,5
      loop L2     		; repeat inner loop
      mov ecx, temp		      
loop L1 		                ; repeat outer loop    
INVOKE ExitProcess,0
name ENDP
