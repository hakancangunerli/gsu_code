.386
.model flat,stdcall 
.stack 4096
ExitProcess PROTO,dwExitCode:DWORD 


.code
;description
name PROC
mov al,01101111b
and al,00101101b 	; a. Al=
mov al,6Dh
and al,4Ah 		; b. Al= 
mov al,00001111b
or al,61h 		; c. Al= 
mov al,94h
xor al,37h 		; d. Al= 
INVOKE ExitProcess,0
name ENDP
